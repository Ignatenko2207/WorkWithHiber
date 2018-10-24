package info.sjd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
@Setter
@Getter
public class Good {

    @Id
    @Column(name = "article_id")
    private String articlId;

    @Column(name = "good_name")
    private String name;

    @Column(name = "price")
    private Integer price;

}
