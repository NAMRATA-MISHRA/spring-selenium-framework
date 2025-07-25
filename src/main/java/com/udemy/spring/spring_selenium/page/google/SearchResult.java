package com.udemy.spring.spring_selenium.page.google;

import com.udemy.spring.spring_selenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResult extends Base {

    @FindBy(css="div.rc")
    private List<WebElement> results;

    public int getCount(){
        return this.results.size();
    }

    @Override
    public boolean isAt(){
        return this.wait.until((d) -> !this.results.isEmpty());
    }
}
