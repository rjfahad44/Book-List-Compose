package com.halaman.com.data

import com.halaman.com.activities.MainActivity

class BookList {
    fun getAllPersonList() = arrayListOf<MainActivity.BookModel>(
        MainActivity.BookModel(
            id = 1,
            name = "1984",
            author = "George Orwell",
            date_publish = "June 8, 1949",
            summary = "\"1984\" is a dystopian novel that depicts a totalitarian society controlled by a repressive government known as Big Brother. The story follows Winston Smith, a citizen who rebels against the oppressive regime and seeks freedom of thought and expression.",
            genre = "Science Fiction",
            price = "\$9.99",
            ratings = "4.5 out of 5 stars",
            url = "https://otimages.com/Bookcover/9333/9781328869333.jpg"
        ),
        MainActivity.BookModel(
            id = 2,
            name = "Pride and Prejudice",
            author = "Jane Austen",
            date_publish = "January 28, 1813",
            summary = "Pride and Prejudice\" is a classic romantic novel set in 19th-century England. The story revolves around Elizabeth Bennet, who navigates societal expectations and wrestles with her own prejudices while slowly falling in love with the proud Mr. Darcy.",
            genre = "Romance",
            price = "\$8.99",
            ratings = "4.8 out of 5 stars",
            url = "https://i.pinimg.com/474x/57/a7/a3/57a7a380adbe10ba4c22ff188437b05e--the-pride-pride-and-prejudice.jpg"
        ),
        MainActivity.BookModel(
            id = 3,
            name = "The Great Gatsby",
            author = "F. Scott Fitzgerald",
            date_publish = "April 10, 1925",
            summary = "The Great Gatsby\" is a literary masterpiece set in the 1920s, known as the Jazz Age. It explores themes of wealth, love, and the pursuit of the American Dream through the enigmatic millionaire Jay Gatsby and his obsession with Daisy Buchanan.",
            genre = "Literary Fiction",
            price = "\$10.99",
            ratings = "4.6 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/commons/7/7a/The_Great_Gatsby_Cover_1925_Retouched.jpg"
        ),
        MainActivity.BookModel(
            id = 4,
            name = "To Kill a Mockingbird",
            author = "Harper Lee",
            date_publish = "July 11, 1960",
            summary = "To Kill a Mockingbird\" is a classic novel set in the fictional town of Maycomb, Alabama, during the 1930s. It explores themes of racial injustice, social inequality, and the loss of innocence through the eyes of Scout Finch, a young girl growing up in the segregated South. The book delves into the trial of Tom Robinson, a black man accused of assaulting a white woman, and the impact it has on the community.",
            genre = "Historical Fiction",
            price = "\$12.99",
            ratings = "4.7 out of 5 stars",
            url = "https://m.media-amazon.com/images/I/710+HcoP38L._AC_UF1000,1000_QL80_.jpg"
        ),
        MainActivity.BookModel(
            id = 5,
            name = "The Catcher in the Rye",
            author = "J.D. Salinger",
            date_publish = "July 16, 1951",
            summary = "The Catcher in the Rye\" follows the disenchanted teenager Holden Caulfield as he navigates the complexities of adolescence, societal expectations, and the loss of innocence. It is a thought-provoking coming-of-age novel that has become a staple in American literature.",
            genre = "Bildungsroman",
            price = "\$9.99",
            ratings = "4.4 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/To_Kill_a_Mockingbird_%28first_edition_cover%29.jpg/728px-To_Kill_a_Mockingbird_%28first_edition_cover%29.jpg"
        ),
        MainActivity.BookModel(
            id = 6,
            name = "To Kill a Mockingbird",
            author = "Harper Lee",
            date_publish = "July 11, 1960",
            summary = "To Kill a Mockingbird\" is a classic novel set in the fictional town of Maycomb, Alabama, during the 1930s. It explores themes of racial injustice, social inequality, and the loss of innocence through the eyes of Scout Finch, a young girl growing up in the segregated South. The book delves into the trial of Tom Robinson, a black man accused of assaulting a white woman, and the impact it has on the community.",
            genre = "Historical Fiction",
            price = "\$12.99",
            ratings = "4.7 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/commons/8/89/The_Catcher_in_the_Rye_%281951%2C_first_edition_cover%29.jpg"
        ),
        MainActivity.BookModel(
            id = 7,
            name = "The Harry Potter Series",
            author = "J.K. Rowling",
            date_publish = "1997-2007 (7 books)",
            summary = "The Harry Potter Series\" is a fantasy saga that chronicles the magical journey of the young wizard Harry Potter and his friends Hermione Granger and Ron Weasley as they attend Hogwarts School of Witchcraft and Wizardry. The series explores themes of friendship, love, bravery, and the fight against the dark wizard Lord Voldemort.",
            genre = "Fantasy",
            price = "\$59.99 (Box Set)",
            ratings = "4.9 out of 5 stars",
            url = "https://blog.flipsnack.com/wp-content/uploads/2019/05/uk_old.jpg.webp"
        ),
        MainActivity.BookModel(
            id = 8,
            name = "The Alchemist",
            author = "Paulo Coelho",
            date_publish = "1988",
            summary = "The Alchemist\" is a philosophical novel that follows the journey of Santiago, a young shepherd boy, as he travels across the desert in search of a hidden treasure. Along the way, he discovers the importance of pursuing one's dreams and the universal language of the soul.",
            genre = "Fiction",
            price = "\$7.99",
            ratings = "4.6 out of 5 stars",
            url = "https://i.pinimg.com/736x/94/85/99/9485993102898bb5a7fdf539267f3fcd--the-alchemist-paulo-coelho.jpg"
        ),
        MainActivity.BookModel(
            id = 9,
            name = "Gone Girl",
            author = "Gillian Flynn",
            date_publish = "June 5, 2012",
            summary = "Gone Girl\" is a psychological thriller that revolves around the mysterious disappearance of Amy Dunne on her fifth wedding anniversary. Told from multiple perspectives, the story explores themes of marriage, deception, and the dark complexities of human relationships.",
            genre = "Thriller/Mystery",
            price = "\$10.99",
            ratings = "4.3 out of 5 stars",
            url = "https://ih1.redbubble.net/image.918212180.8788/flat,750x,075,f-pad,750x1000,f8f8f8.u1.jpg"
        ),

        MainActivity.BookModel(
            id = 10,
            name = "To All the Boys I've Loved Before",
            author = "Jenny Han",
            date_publish = "April 15, 2014",
            summary = "To All the Boys I've Loved Before\" is a contemporary young adult novel that tells the story of Lara Jean Covey, a high school student whose secret love letters get mysteriously sent to all her past crushes. As she navigates the aftermath, Lara Jean discovers the complexities of love, family, and self-discovery.",
            genre = "Young Adult Romance",
            price = "\$9.99",
            ratings = "4.5 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/id/b/b8/To_All_the_Boys_I%27ve_Loved_Before_poster.jpg"
        ),
        MainActivity.BookModel(
            id = 11,
            name = "The Da Vinci Code",
            author = "Dan Brown",
            date_publish = "March 18, 2003",
            summary = "The Da Vinci Code\" is a gripping thriller that follows symbologist Robert Langdon as he unravels a series of ancient clues in a quest to uncover a secret that could shake the foundations of Christianity. The book combines art, history, and mystery, keeping readers on the edge of their seats.",
            genre = "Thriller/Mystery",
            price = "\$12.99",
            ratings = "4.6 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/id/d/d8/DVCIndonesia.jpg"
        ),

        MainActivity.BookModel(
            id = 12,
            name = "The Chronicles of Narnia",
            author = "C.S. Lewis",
            date_publish = "1950-1956 (7 books)",
            summary = "The Chronicles of Narnia\" is a beloved fantasy series that transports readers to the magical land of Narnia, where they embark on extraordinary adventures alongside characters such as Lucy, Edmund, Susan, and Peter. The series explores themes of bravery, sacrifice, and the battle between good and evil.",
            genre = "Fantasy",
            price = "\$49.99 (Box Set)",
            ratings = "4.7 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/en/c/cb/The_Chronicles_of_Narnia_box_set_cover.jpg"
        ),

        MainActivity.BookModel(
            id = 13,
            name = "The Girl on the Train",
            author = "Paula Hawkins",
            date_publish = "January 13, 2015",
            summary = "The Girl on the Train\" is a psychological thriller that follows Rachel Watson, a woman who becomes entangled in a missing person investigation after witnessing something shocking while commuting on a train. The gripping narrative delves into themes of memory, perception, and the darkness that can lurk beneath seemingly ordinary lives.",
            genre = "Thriller/Mystery",
            price = "\$10.99",
            ratings = "4.2 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/en/5/50/The_Girl_On_The_Train_%28US_cover_2015%29.png"
        ),

        MainActivity.BookModel(
            id = 14,
            name = "The Kite Runner",
            author = "Khaled Hosseini",
            date_publish = "May 29, 2003",
            summary = "The Kite Runner\" is a gripping novel that explores friendship, betrayal, and redemption. Set against the backdrop of Afghanistan's tumultuous history, it follows the intertwined lives of Amir and Hassan, two childhood friends from different social classes, and the consequences of a fateful incident that haunts them into adulthood.",
            genre = "Historical Fiction",
            price = "\$11.99",
            ratings = "4.6 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/en/6/62/Kite_runner.jpg"
        ),

        MainActivity.BookModel(
            id = 15,
            name = "The Hunger Games",
            author = "Suzanne Collins",
            date_publish = "September 14, 2008",
            summary = "The Hunger Games\" is a dystopian trilogy set in a post-apocalyptic world where teenagers from various districts are forced to participate in a televised fight to the death. The series follows Katniss Everdeen as she becomes a symbol of rebellion against the oppressive Capitol. It delves into themes of survival, inequality, and the power of individual courage.",
            genre = "Young Adult Dystopian",
            price = "\$24.99 (Box Set)",
            ratings = "4.9 out of 5 stars",
            url = "https://m.media-amazon.com/images/I/614SwlZNtJL._AC_UF1000,1000_QL80_.jpg"
        ),

        MainActivity.BookModel(
            id = 16,
            name = "The Fault in Our Stars",
            author = "John Green",
            date_publish = "January 10, 2012",
            summary = "The Fault in Our Stars\" is a poignant young adult novel that tells the story of Hazel Grace Lancaster, a teenager with cancer who falls in love with Augustus Waters, another cancer patient she meets at a support group. The book explores themes of love, mortality, and the pursuit of meaning in the face of adversity.",
            genre = "Young Adult Romance",
            price = "\$8.99",
            ratings = "4.7 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/id/a/a9/The_Fault_in_Our_Stars.jpg"
        ),

        MainActivity.BookModel(
            id = 17,
            name = "The Secret Life of Bees",
            author = "Sue Monk Kidd",
            date_publish = "November 8, 2001",
            summary = "The Secret Life of Bees\" is a captivating novel set in the 1960s that follows the journey of fourteen-year-old Lily Owens as she escapes her troubled home life and finds solace and empowerment in the company of three beekeeping sisters. The book explores themes of family, identity, and the power of female relationships.",
            genre = "Historical Fiction",
            price = "\$10.99",
            ratings = "4.5 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/en/1/1f/The_Secret_Life_of_Bees.jpg"
        ),

        MainActivity.BookModel(
            id = 18,
            name = "The Book Thief",
            author = "Markus Zusak",
            date_publish = "March 14, 2006",
            summary = "The Book Thief\" is a captivating historical novel set in Nazi Germany. It follows the story of Liesel Meminger, a young girl who discovers the power of words and storytelling amidst the horrors of war. The book explores themes of resilience, friendship, and the impact of literature on the human spirit.",
            genre = "Historical Fiction",
            price = "\$9.99",
            ratings = "4.8 out of 5 stars",
            url = "https://upload.wikimedia.org/wikipedia/en/8/8f/The_Book_Thief_by_Markus_Zusak_book_cover.jpg"
        ),

        MainActivity.BookModel(
            id = 19,
            name = "The Picture of Dorian Gray",
            author = "Oscar Wilde",
            date_publish = "June 20, 1890",
            summary = "The Picture of Dorian Gray\" is a philosophical novel that explores the corrupting influence of hedonism and the pursuit of eternal youth and beauty. It follows the life of Dorian Gray, a young man who remains eternally youthful while a portrait of him ages and reflects the hidden consequences of his immoral actions.",
            genre = "Gothic Fiction",
            price = "\$7.99",
            ratings = "4.5 out of 5 stars",
            url = "https://ebooks.gramedia.com/ebook-covers/49386/image_highres/ID_EC2019MTH09PDG.jpg"
        ),

        MainActivity.BookModel(
            id = 20,
            name = "The Handmaid's Tale",
            author = "Margaret Atwood",
            date_publish = "February 17, 1985",
            summary = "The Handmaid's Tale\" is a dystopian novel set in a totalitarian society where women are subjugated and assigned reproductive roles. The story follows Offred, a handmaid who navigates a world of oppression, power struggles, and rebellion. The book explores themes of gender, identity, and the consequences of totalitarianism.",
            genre = "Dystopian Fiction",
            price = "\$12.99",
            ratings = "4.6 out of 5 stars",
            url = "https://i.pinimg.com/550x/02/ec/5e/02ec5efbd10f14eeffa935e57700f025.jpg"
        ),
    )
}