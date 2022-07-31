package com.rstliz.kotlin.demo.repository

import com.rstliz.kotlin.demo.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>