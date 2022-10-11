package edu.miu.productservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.actuate.audit.listener.AuditListener;
import org.springframework.data.domain.Auditable;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Product {
    @Id
    private int id;
    private String name;
    private String vendor;

    @Enumerated(EnumType.STRING)
    private ProductType category;
}
