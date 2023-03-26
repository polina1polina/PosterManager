import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void addPostersTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film1");
        manager.addPoster("Film2");
        manager.addPoster("Film3");
        manager.addPoster("Film4");

        String[] expected = {"Film1", "Film2", "Film3", "Film4"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addOnePosterTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film");

        String[] expected = {"Film"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addNoPosterTest() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void reverseTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film1");
        manager.addPoster("Film2");
        manager.addPoster("Film3");
        manager.addPoster("Film4");

        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastNumberTest() {
        PosterManager manager = new PosterManager(7);
        manager.addPoster("Film1");
        manager.addPoster("Film2");
        manager.addPoster("Film3");
        manager.addPoster("Film4");
        manager.addPoster("Film5");
        manager.addPoster("Film6");
        manager.addPoster("Film7");
        manager.addPoster("Film8");

        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findFilmNumberTest() {
        PosterManager manager = new PosterManager(7);
        manager.addPoster("Film1");
        manager.addPoster("Film2");
        manager.addPoster("Film3");
        manager.addPoster("Film4");
        manager.addPoster("Film5");
        manager.addPoster("Film6");
        manager.addPoster("Film7");


        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLessNumberTest() {
        PosterManager manager = new PosterManager(5);
        manager.addPoster("Film1");
        manager.addPoster("Film2");
        manager.addPoster("Film3");
        manager.addPoster("Film4");


        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


}