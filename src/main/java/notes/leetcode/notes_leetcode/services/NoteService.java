package notes.leetcode.notes_leetcode.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class NoteService {

    public String getWelcomePage() {
        log.info("Atleast it works now");
        return "Yay, Welcome back to notes";
    }

    public void createNote() {

    }
}
