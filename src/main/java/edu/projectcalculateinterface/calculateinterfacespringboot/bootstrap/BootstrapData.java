package edu.projectcalculateinterface.calculateinterfacespringboot.bootstrap;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.*;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.DivisionRepository;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.MultiRepository;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.SubRepository;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.SumRepository;
import edu.projectcalculateinterface.calculateinterfacespringboot.services.DivisionCalculate;
import edu.projectcalculateinterface.calculateinterfacespringboot.services.MultiCalculate;
import edu.projectcalculateinterface.calculateinterfacespringboot.services.SubCalculate;
import edu.projectcalculateinterface.calculateinterfacespringboot.services.SumCalculate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private CalculateService calculateServices;
    private final SumRepository sumRepository;
    private final DivisionRepository divisionRepository;
    private final MultiRepository multiRepository;
    private final SubRepository subRepository;


    public BootstrapData(SumRepository sumRepository, DivisionRepository divisionRepository, MultiRepository multiRepository, SubRepository subRepository) {
        this.sumRepository = sumRepository;
        this.divisionRepository = divisionRepository;
        this.multiRepository = multiRepository;
        this.subRepository = subRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        CalculateService cs;

        //Soma
        Sum sum = new Sum();

        cs = new CalculateService(new SumCalculate(sum));

        cs.calculate(10.0, 5.0);
        sumRepository.save(sum);

        //Sub
        Sub sub = new Sub();

        cs = new CalculateService(new SubCalculate(sub));

        cs.calculate(10.0, 6.0);

        subRepository.save(sub);

        //Multi

        Multi multi = new Multi();

        cs = new CalculateService(new MultiCalculate(multi));

        cs.calculate(2.0, 80.0);

        multiRepository.save(multi);

        //Div

        Division div = new Division();

        cs = new CalculateService(new DivisionCalculate(div));

        cs.calculate(10.0, 5.0);


        divisionRepository.save(div);
    }
}
