package com.tommasobrichetti.bed1w5;

import com.tommasobrichetti.bed1w5.products.Consumation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Ordinazione {

    public List<Consumation> list = new ArrayList<>();

    public void addToConto(Consumation c) {
        this.list.add(c);
    }

    public Double getTotal(){
        Double tot = 0.0;
        for (int i = 0; i < this.list.size(); i++) {
           tot += list.get(i).getPrice();
        }
        return tot;
    }
}
