package com.example.demo;

import mockit.Tested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoServiceTest
{
   @Tested
   DemoService demoService;

   @Test
   public void testReturnTrue()
   {
      assertEquals(true, demoService.returnTrue());
   }
}
