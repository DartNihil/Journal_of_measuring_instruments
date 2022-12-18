package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment extends AbstractEntity {

    private String name;
    private String inventoryNumber;
    private String verificationDate;

}
