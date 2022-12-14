package com.lean.moneynote.common;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public class ResponseHelper {
	public static ResponseEntity<Object> getResponse(Object obj, HttpStatus status){
		Map<String,Object> map = new HashMap<String ,Object>();
		map.put("content", obj);
		map.put("hasError", false);
		map.put("errors", "");
		map.put("timestamp", LocalDateTime.now());
		map.put("status", status.value());
		return new ResponseEntity<Object>(map,status);
	}
	public static ResponseEntity<Object> getErrorsResponse(BindingResult errors,HttpStatus status ){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("content", null);
		map.put("hasError", true);
		map.put("error", ErrorHelper.getAllError(errors));
		map.put("timestamp", LocalDateTime.now());
		map.put("status", status.value());
		return new ResponseEntity<Object>(map,status);
	}
	public static ResponseEntity<Object> getErrorsResponse(String errors,HttpStatus status ){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("content", null);
		map.put("hasError", true);
		map.put("error", errors);
		map.put("timestamp", LocalDateTime.now());
		map.put("status", status.value());
		return new ResponseEntity<Object>(map,status);
	}
}
