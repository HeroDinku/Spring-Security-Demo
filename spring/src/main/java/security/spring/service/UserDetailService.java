package security.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import security.spring.model.MyUserDetailImpl;
import security.spring.repo.UserRepository;

@Service
public class UserDetailService implements UserDetailsService{

 @Autowired
  private UserRepository userRepository;

  @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new MyUserDetailImpl(userRepository.findByUserName(username));

    }




}
