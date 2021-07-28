package com.company.Spring.models.repo;

import com.company.Spring.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long>{
}
