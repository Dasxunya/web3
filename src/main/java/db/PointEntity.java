package db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "points")
@ToString
@Getter
@Setter
public class PointEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "x")
    private Float x;
    @Column(name = "y")
    private Float y;
    @Column(name = "r")
    private Float r;
    @Column(name = "result")
    private String result;
    @Column(name = "time")
    private String time;
}
