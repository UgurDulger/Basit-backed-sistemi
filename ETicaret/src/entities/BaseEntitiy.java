package entities;

import java.time.LocalDateTime;

public class BaseEntitiy {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime deletedDate;
    private LocalDateTime updatedDate;

    public BaseEntitiy(int id, LocalDateTime createdDate, LocalDateTime deletedDate, LocalDateTime updatedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        this.updatedDate = updatedDate;
    }
    public BaseEntitiy(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
