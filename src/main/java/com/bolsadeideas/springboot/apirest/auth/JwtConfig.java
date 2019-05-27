package com.bolsadeideas.springboot.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA ="alguna.clave.secreta.1234578";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAxLrHmsspNW/osiJLrl2XuN3oWwvgI0gA5KuQ7iOGUPoUifS6\r\n" + 
			"Wx/PGgo0GXwj1M0epp2lBs+78/UbneGfQP356oMRdGbWArA5gR2SmShoe6cWdS9n\r\n" + 
			"QSP5jxjL7dFsJLFpHwrh7DT6GoivkwzgCAKrRSqiNNSVy/JPwLZ+bSkmC0p7+jLc\r\n" + 
			"7hZe17GxVrZNtszh2cmMTxHSOJ6Jfd8QclA48NW5jgnHc8RM5KRZqvenw6E6cU6+\r\n" + 
			"H02JnVafiXhoqKj2NmisISQqwHDpY7/3716r1AFhORRjHyv2HigYkUX1I25YxwMr\r\n" + 
			"D3G1aEYQSYfQiXOpoqzOqPPJ/j+zIvtsHDDmrQIDAQABAoIBADD0GX9XVqXJdyn8\r\n" + 
			"hsCY4YxLC+q8BcZBwJcmaiYYCPBVio7ZqxXJ0Is2Rsigr3ngoOPtDoenYanPMFQV\r\n" + 
			"NL/Dc1D71HgWruJ0X5rVdQlPmNBMP7ZhWVxIS21kSjqfhj2LOBFVb+qLNEEuCiKZ\r\n" + 
			"bZYQs/W+KibjT3M0lMvrnYIkXycnrZ0AHXByp0eL/X47HXe4mcLzs8eGGc1NeC7P\r\n" + 
			"5SwxsD4IXT5rbsGEpTmYBJn9Or4UpOyBNVp9kkhclgdnvcZPjhXkubDx8d7ZVLoe\r\n" + 
			"oiH82KZh+JN6+uyStOfQzERZiyIx1e2oMY4wZII+sTSIKDExpNflG0bUVc8tDX0d\r\n" + 
			"tgLGWwECgYEA9OLVWhzH5rGtbpjpt0frfgNaGTp9harNczwhQCP1Gnm4Qh1zYDbL\r\n" + 
			"Nm+WzN4U5VIYaDGQstChuqENh+pgC1MWq3j1YobIFWS0o19uisE+HgVQSFCYQMcA\r\n" + 
			"YM5XCg1IdGXyNHNff8DAJGIxLCiAhYtVSqmeMGnD1uemN6bAxhIg290CgYEAzahy\r\n" + 
			"4nCbRG/OzxuZiwX8jip9aLti3Isw4hKlk5XkoAIQCmP0soKOHHM2ZIUGGXunSmnX\r\n" + 
			"ghz1EuUyMt99wQO7ym9LO7Mq/874TwEwRMuvvUopO7wJICdbF9CzStcI4FAGR9/h\r\n" + 
			"uCRnjlhZyCLkDkCV9NTb1UDDX5lpX7KOXPFRMRECgYEAty/sS9GV1EP7qe0ngFyD\r\n" + 
			"lCtrvc2cUl53/AjyEqoTUy/Un1iqk0HJ+Dm3hB9pYDZuXZseVDVvlk2d8ptoJ3CL\r\n" + 
			"V9BPN9n9WMuRuVjNN2zhS9HLwZzQmDyFUuVoBPP0zGXqrkPUH5wP3+e4QwE1SzD0\r\n" + 
			"p7qExFCKGHwHQkAymri67d0CgYBiMuWwY+5vrieE0vvs2w3t4DIDmT4qargLqrWv\r\n" + 
			"E+qX0IRSQcoslpQ+13CIbNAtyNJngMRrl2IaBKCElBya1iqMDbpRpkqI3Q3Jw5qF\r\n" + 
			"rvCaJNgtcqq01LX1WCzUNntBiFSHa0p/P7rGyD8OhkJ437P6tMzHNeZUNo+PJ1Y8\r\n" + 
			"4OlQ0QKBgQC/TMvMEZ7snlxpLh0VlITTMJ+avelcp8w0uR61E+YpY/YL1GFoZk0g\r\n" + 
			"2Fb5AA2ReGhkAg/atFoI4YHIgbUS/1L4NrzhOuEF30OCFjfKiB9ZY2f2z3NFXLQW\r\n" + 
			"fwIBCecCMwXWbQ8TcnFjzjiU4taIK4up3Fg4O+R7NI41RBgeSKreqA==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
			
			
    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
    		"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxLrHmsspNW/osiJLrl2X\r\n" + 
    		"uN3oWwvgI0gA5KuQ7iOGUPoUifS6Wx/PGgo0GXwj1M0epp2lBs+78/UbneGfQP35\r\n" + 
    		"6oMRdGbWArA5gR2SmShoe6cWdS9nQSP5jxjL7dFsJLFpHwrh7DT6GoivkwzgCAKr\r\n" + 
    		"RSqiNNSVy/JPwLZ+bSkmC0p7+jLc7hZe17GxVrZNtszh2cmMTxHSOJ6Jfd8QclA4\r\n" + 
    		"8NW5jgnHc8RM5KRZqvenw6E6cU6+H02JnVafiXhoqKj2NmisISQqwHDpY7/3716r\r\n" + 
    		"1AFhORRjHyv2HigYkUX1I25YxwMrD3G1aEYQSYfQiXOpoqzOqPPJ/j+zIvtsHDDm\r\n" + 
    		"rQIDAQAB\r\n" + 
    		"-----END PUBLIC KEY-----";
}
