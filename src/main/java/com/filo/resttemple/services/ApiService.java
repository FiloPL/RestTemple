package com.filo.resttemple.services;

import com.filo.resttemple.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 03.05.2022
 **/

public interface ApiService {

    List<User> getUsers(Integer limit);
    Flux<User> getUsers(Mono<Integer> limit);
}
