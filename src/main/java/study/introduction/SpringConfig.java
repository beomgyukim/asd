package study.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.introduction.aop.TimeTraceAop;
import study.introduction.repository.*;
import study.introduction.service.MemberService;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }
}
