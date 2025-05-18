package notes.leetcode.notes_leetcode.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Entity
@Data
public class NotePage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uuid;

    private String questionNumber;

    private String questionTitle;

    private String leetcodeLink;

    private String description;

    private List<Tags> tagsList;

    private List<Solutions> solutionsList;

    @Builder.Default
    private boolean toBeRevised = true;

    @Builder.Default
    private boolean isImportant = false;

    private LocalDateTime createdOn;
}
