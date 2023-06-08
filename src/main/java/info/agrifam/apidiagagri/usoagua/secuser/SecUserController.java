package info.agrifam.apidiagagri.secuser;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class SecUserController {

    private  final  SecUserRepository secUserRepository;

    private final SecUserMapper secUserMapper;

    public SecUserController(SecUserRepository secUserRepository, SecUserMapper secUserMapper) {
        this.secUserRepository = secUserRepository;
        this.secUserMapper = secUserMapper;
    }
    @GetMapping()
    public List<SecUser> Get(){

        List<SecUser> all = secUserRepository.findAll( Sort.by("id") );
        return all;

    }
    @GetMapping("/{id}")
    public ResponseEntity<SecUser> GetById(@PathVariable(value = "id") String id){
        Optional<SecUser> secUser = secUserRepository.findById(id);
        return secUser.map(user -> new ResponseEntity<>(user, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
    @PostMapping()
    public SecUserDto save(@RequestBody  SecUserDto secUserDto) {

        SecUser secUser =  secUserMapper.toEntity(secUserDto);
        return secUserMapper.toDto(secUserRepository.save(secUser));
    }
    @PostMapping("/alterar")
    public SecUserDto update(@RequestBody  SecUserDto secUserDto) {
        if (secUserDto.getId() == null) {
            throw new IllegalArgumentException("Sec user ID não nula, faça um novo lançamento");

        }
        SecUser secUser = secUserRepository.findById(secUserDto.getId()).orElseThrow();
        SecUser secUser1 = secUserMapper.partialUpdate(secUserDto, secUser);
        return secUserMapper.toDto(secUserRepository.save(secUser1));

    }

}
