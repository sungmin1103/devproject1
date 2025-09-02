package com.boot.example.mapper;

import com.boot.example.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BookMapperTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void bookListTest(){
        bookMapper.bookList().stream().forEach((book -> log.info(book.toString())));

    }

    @Test
    public void testBookInsert() {
        /* 값은 여러분이 채워주세요. */
        Book book = Book.builder()
                .title("어린왕자")
                .author("갈릴레오갈릴레이")
                .publisher("가나다")
                .publishDate("2024-01-15")
                .price(19500).build();
        int result = bookMapper.bookInsert(book);
        log.info("적용된 행의 수: {}", result); //로그 메시지 템플릿 → {}는 변수명 명시.
    }

    @Test
    public void testBookDelete() {
        Book book = Book.builder().bookId(26).build();
        int result = bookMapper.bookDelete(book);
        log.info("삭제된 행의 수: {}", result);
    }

    @Test
    public void testBookUpdate() {
        Book book = Book.builder()
                .title("다정한 사람이 이긴다")
                .author("이해인")
                .publisher("필름")
                .publishDate("2025-08-13")
                .price(19000).bookId(25).build();
        int result = bookMapper.bookUpdate(book);
        log.info("수정된 행의 수: {}", result);
    }

}

