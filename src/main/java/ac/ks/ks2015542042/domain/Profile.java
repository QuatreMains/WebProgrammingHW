package ac.ks.ks2015542042.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//Lombok
@Getter
@NoArgsConstructor
//JPA
@Entity
@Table
public class Profile implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String network;

    @Column
    private String username;

    @Column
    private String url;

    @Builder
    public Profile(String network, String username, String url) {
        this.network = network;
        this.username = username;
        this.url = url;
    }
}
