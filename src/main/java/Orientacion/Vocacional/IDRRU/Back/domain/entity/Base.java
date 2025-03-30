package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass

public class Base {
    @Column(name = "active")
    public boolean active = true;

    @Column(updatable = false, name = "create_at")
    @CreationTimestamp
    public LocalDateTime createdAt;


    @Column(name = "update_at")
    @UpdateTimestamp
    public LocalDateTime updatedAt;
}
