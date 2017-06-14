package org.nmdp.hmlfhir.mapping.hml;

/**
 * Created by Andrew S. Brown, Ph.D., <abrown3@nmdp.org>, on 4/18/17.
 * <p>
 * service-hmlFhirConverter
 * Copyright (c) 2012-2017 National Marrow Donor Program (NMDP)
 * <p>
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or (at
 * your option) any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library;  if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.
 * <p>
 * > http://www.fsf.org/licensing/licenses/lgpl.html
 * > http://www.opensource.org/licenses/lgpl-license.php
 */

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.nmdp.hmlfhirconvertermodels.domain.fhir.FhirDefinedType;
import org.nmdp.hmlfhirconvertermodels.domain.fhir.FhirMessage;
import org.nmdp.hmlfhirconvertermodels.domain.fhir.GenotypingResultsHaploid;
import org.nmdp.hmlfhirconvertermodels.domain.fhir.lists.GenotypingResultsHaploids;
import org.nmdp.hmlfhirconvertermodels.dto.*;
import org.nmdp.hmlfhirconvertermodels.lists.Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GenotypingResultsHaploidMap implements Converter<FhirMessage, Samples> {

    @Override
    public Samples convert(MappingContext<FhirMessage, Samples> context) {
        if (context.getSource() == null) {
            return null;
        }

        Samples samples = new Samples();
        List<Sample> sampleList = new ArrayList<>();
        FhirMessage fhir = context.getSource();
//        GenotypingResultsHaploids genotypingResultsHaploids = fhir.getGenotypingResultsHaploids();
//
//        for (GenotypingResultsHaploid genotypingResultsHaploid : genotypingResultsHaploids.getGenotypingResultsHaploids()) {
//            FhirDefinedType fhirDefinedType = genotypingResultsHaploid.getType();
//            Haploid haploid = new Haploid();
//            AlleleAssignment alleleAssignment = new AlleleAssignment();
//            Typing typing = new Typing();
//            Sample sample = new Sample();
//
//            haploid.setMethod(fhirDefinedType.getMethod());
//            haploid.setLocus(fhirDefinedType.getLocus());
//            haploid.setType(fhirDefinedType.getFhirType());
//            alleleAssignment.setHaploid(Arrays.asList(haploid));
//            typing.setAlleleAssignment(Arrays.asList(alleleAssignment));
//            sample.setTyping(Arrays.asList(typing));
//            sampleList.add(sample);
//        }

        samples.setSamples(sampleList);

        return samples;
    }
}
