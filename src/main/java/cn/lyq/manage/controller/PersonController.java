package cn.lyq.manage.controller;

import cn.lyq.manage.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName Person
 * @Date 2019/11/28 0028 19:11
 **/
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/html")
    public String getHtml(Map<String,Person> map, Model model){
        map.put("a",new Person("张三","20","男"));
        map.put("b",new Person("李四","21","男"));
        map.put("c",new Person("王五","22","女"));
        map.put("d",new Person("王五","25","女"));
        map.put("d",new Person("王liu","25","女"));
        map.put("e",new Person("as","25","女"));
        Person person = new Person("赵七", "22", "男");
        model.addAttribute("person",person);
        System.out.println(new Person("赵六","22","男"));
        return "person";
    }

    public static void main(String[] args) {
        System.out.println("张三是一个男孩");
    }
}

