package sgu.respone.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/success")
    public ResponseEntity<String> successResponse() {
        String responseBody = "Request was successful!";
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping("/notfound")
    public ResponseEntity<String> notFoundResponse() {
        String responseBody = "Resource not found!";
        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/customheader")
    public ResponseEntity<String> customHeaderResponse() {
        String responseBody = "Response with custom header!";
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Custom-Header", "CustomValue")
                .body(responseBody);
    }



}