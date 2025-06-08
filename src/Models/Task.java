package Models;




public class Task {
    private static int id = 0;
    private String desc;
    private String createdAt;
    private String updatedDate;
    private State status;

    public Task(){
        this.id++;
    }

    public int getId(){
        return this.id;
    }
    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public State getStatus() {
        return this.status;
    }

    public void setStatus(State status) {
        this.status = status;
    }

  



}
