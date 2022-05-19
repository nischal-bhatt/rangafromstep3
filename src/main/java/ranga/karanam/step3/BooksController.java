package ranga.karanam.step3;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(new Book(1l,"mastering spring 5.5","ranga karanam"),
				             new Book(2l,"nishi b","nn"),
				             new Book(2l,"nishi b","nn"),
				             new Book(8l,"nishi b","nn"),
				             new Book(3l,"nishi b","nn"));
	}
}
