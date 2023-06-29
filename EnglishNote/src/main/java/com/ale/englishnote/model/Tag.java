package com.ale.englishnote.model;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tag implements Serializable {
    public int id;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return id == tag.id && Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
