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

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @author q1219331697
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser // (username = "admin", password = "admin111")
// 定义测试执行顺序（按方法名升序）
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerTest {

	private static final Logger log = LoggerFactory.getLogger(UserControllerTest.class);

	// @Autowired
	// private WebApplicationContext context;
	@Autowired
	private MockMvc mockMvc;

	// private ResultActions resultActions;

	// @Before
	// public void setup() {
	// mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	// }

	// public void setup() throws Exception {
	// resultActions =
	// mockMvc.perform(formLogin("/auth").user("admin").password("pass"));
	// }

	@Test
	public void test01Index() throws Exception {
		MvcResult mvcResult = this.mockMvc.perform(formLogin("/login").user("admin").password("admin"))
				.andExpect(authenticated()).andReturn();
		// MvcResult mvcResult =
		// mockMvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
		// .andExpect(authenticated()).andReturn();
		int statusCode = mvcResult.getResponse().getStatus();
		// Assert.assertEquals(200, statusCode);
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println("body:" + body);
	}

	@Test
	public void testEditNew() {
	}

	@Test
	public void testCreate() {
	}

	@Test
	public void testShow() {
	}

	@Test
	public void testEdit() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDestroy() {
	}

}
