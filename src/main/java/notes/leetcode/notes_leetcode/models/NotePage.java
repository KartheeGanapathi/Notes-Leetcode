package notes.leetcode.notes_leetcode.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class NotePage {
    private LocalDateTime createdOn;
    private String leetcodeLink;
    private String questionTitle;
    private String questionNumber;
    private List<Tags> tagsList;
    private List<Solutions> solutionsList;
}
