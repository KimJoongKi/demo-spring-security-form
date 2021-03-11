package me.yaddoong.demospringsecurityform.form;

import me.yaddoong.demospringsecurityform.account.Account;
import me.yaddoong.demospringsecurityform.account.AccountContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SampleService {

    public void dashboard() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println("================");
        System.out.println("authentication = " + authentication);
        System.out.println("account.getUsername() = " + userDetails.getUsername());
    }
}
