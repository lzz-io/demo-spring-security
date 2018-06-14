/*
 * Copyright qq:1219331697
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.lzz.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author q1219331697
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@GetMapping(value = { "", "/" })
	public String index() {
		return "user list";
	}

	@GetMapping(value = "/new")
	public String editNew() {
		return "新增用户页面";
	}

	@PostMapping("/")
	public String create() {
		return "add new user";
	}

	@GetMapping(value = "/{userId}")
	public String show(@PathVariable("userId") int userId) {
		return "user : id = " + userId;
	}

	@GetMapping(value = { "/{userId}/edit", "/{userId};edit" })
	public String edit() {
		return "edit page";
	}

	@PutMapping("/{userId}")
	public String update() {
		return "update user";
	}

	@DeleteMapping("/{userId}")
	public String destroy() {
		return "delete user";
	}

}
