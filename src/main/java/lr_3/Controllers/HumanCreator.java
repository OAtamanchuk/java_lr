package lr_3.Controllers;

import lr_3.Models.Sex;
import lr_3.Models.Human;

public class HumanCreator {
    public Human createHuman(String name, String surname, String patronymic, Sex sex) {
        return new Human(name, surname, patronymic, sex);
    }

    public Human createTypicalHuman() {
        return createHuman("Typical Name", "Typical Surname", "Typical Patronymic", Sex.FEMALE);
    }
}