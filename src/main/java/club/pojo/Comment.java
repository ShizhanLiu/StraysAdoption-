package club.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import com.baomidou.mybatisplus.annotations.TableField;

import java.util.Date;
import java.util.List;

/**
 * @author Mr Wu
 * @create: 2019-08-20 14:23
 */
@Data
public class Comment {
    private Integer id;
    private Integer userId;
    private Integer adminsId;
    private Integer petId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date commentTime;
    private String content;
    @TableField(exist = false)
    private User user;
    @TableField(exist = false)
    private Admins admin;
    @TableField(exist = false)
    private Pet pet;
    @TableField(exist = false)
    private List<Answer> answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAdminsId() {
        return adminsId;
    }

    public void setAdminsId(Integer adminsId) {
        this.adminsId = adminsId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
