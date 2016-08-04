package testwebapp;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.common.CdService;
import com.example.webapp.config.RootConfig;
import com.example.webapp.controller.HomeController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class)
public class HomeControllerTest {
	
	@Autowired
	private CdService cdService; 

	@Test
	public void test() throws Exception {
		HomeController homeCont = new HomeController(cdService);
		MockMvc mockMvc = standaloneSetup(homeCont).build();
		mockMvc.perform(get("/"))
	       .andExpect(view().name("home"))
	       .andExpect(model().attributeExists("cds"));
	       //.andExpect(model().attribute("cds", hasItems(expectedCds)));
	}

}
