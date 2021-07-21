package be.stijnhooft.portal.portfolio.controllers;

import be.stijnhooft.portal.portfolio.model.SearchResult;
import be.stijnhooft.portal.portfolio.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;
import java.nio.charset.Charset;

@RestController
@RequestMapping("/api/search/")
public class SearchController {

    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @RequestMapping("/")
    public SearchResult search(@RequestParam("query") String query) {
        String q = URLDecoder.decode(query, Charset.forName("UTF-8"));
        return searchService.search(q);
    }
}
