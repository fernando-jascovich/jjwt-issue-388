package com.example.jjwtkissue

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import android.widget.TextView

class Main(): AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)



        val acceptableKey = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
        val token = Jwts.builder()
                .claim("myclaim", "myclaimValue")
                .signWith(SignatureAlgorithm.HS256, acceptableKey.toByteArray())
                .compact()

        val textView = findViewById<TextView>(R.id.token).setText(token)
    }
}
