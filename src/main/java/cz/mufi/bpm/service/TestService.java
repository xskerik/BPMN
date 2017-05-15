package cz.mufi.bpm.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	
	public long square (int num) {
		
		return num * num;
	}
}
