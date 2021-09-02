package be.vdab.strips.repositories;

import be.vdab.strips.domain.Figuur;

import java.util.List;

public interface FiguurRepository {
    List<Figuur> findAll();
}
