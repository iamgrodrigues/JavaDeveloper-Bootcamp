package com.innovationone.springwebmvc.repository;

import com.innovationone.springwebmvc.model.Jedi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class JediRepository {

    private  List<Jedi> jedi;

    public List<Jedi> getAllJedi() {
        return this.jedi;
    }

    public void add(final Jedi jedi) {
        this.jedi.add(jedi);
    }
}
