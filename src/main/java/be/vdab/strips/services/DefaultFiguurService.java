package be.vdab.strips.services;

import be.vdab.strips.domain.Figuur;
import be.vdab.strips.repositories.FiguurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DefaultFiguurService implements FiguurService{
    private final FiguurRepository repository;

    public DefaultFiguurService(FiguurRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Figuur> findAll() {
        return repository.findAll();
    }
}
