package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService
{
   @Value("${readTimeout}")
   private int readTimeout;

   public boolean returnTrue()
   {
      return true;
   }
}
