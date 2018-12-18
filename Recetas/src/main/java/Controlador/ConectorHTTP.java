package Controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;

public class ConectorHTTP {
	
		   public static void main(String[] args)
		    throws MalformedURLException, IOException {
		 
		      URL url = new URL("http://localhost:63342/Interfaz/index.html");
		      URLConnection con = url.openConnection();
		 
		      Authenticator au = new Authenticator() {
		         @Override
		         protected PasswordAuthentication
		            getPasswordAuthentication() {
		            return new PasswordAuthentication
		               ("root", "1234".toCharArray());
		         }
		      };
		      Authenticator.setDefault(au);
		 
		      BufferedReader in = new BufferedReader(
		         new InputStreamReader(con.getInputStream()));
		 
		      String linea;
		      while ((linea = in.readLine()) != null) {
		         System.out.println(linea);
		      }
		   }
		}