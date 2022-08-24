package com.leonardom011.lecbudget.config

import com.leonardom011.lecbudget.authentication.entity.Client
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class MyUserDetails : UserDetails {
    private lateinit var client: Client

    fun MyUserDetails(client: Client) {
        this.client = client
    }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return client.authority.name
    }

    override fun getPassword(): String {
        TODO("Not yet implemented")
    }

    override fun getUsername(): String {
        TODO("Not yet implemented")
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }

}