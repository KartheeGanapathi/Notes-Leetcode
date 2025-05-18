package notes.leetcode.notes_leetcode.controllers;

import notes.leetcode.notes_leetcode.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/csrf")
    public CsrfToken csrf(CsrfToken token) {
        return token;
    }

    @PostMapping("/why")
    public ResponseEntity<String> welcome() {
        String welcomeDialogue = this.noteService.getWelcomePage();
        return ResponseEntity.ok(welcomeDialogue);
    }

    @PostMapping("/create_note")
    public ResponseEntity<Void> createNote() {
        noteService.createNote();
        return ResponseEntity.ok().build();
    }

}
