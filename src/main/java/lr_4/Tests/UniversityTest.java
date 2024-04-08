package lr_4.Tests;

import lr_4.Controllers.JsonManager;
import lr_4.Controllers.UniversityCreator;
import lr_4.Models.University;

import org.junit.Test;

public class UniversityTest {
    @Test
    public void jsonManager_WriteUniversityToJsonAndRead_ShouldBeIdentical() {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity(2);

        JsonManager jm = new JsonManager();
        jm.write(oldUniversity);
        University newUniversity = jm.read();

        newUniversity.equals(oldUniversity);
    }
}
