package org.nmdp.hmlfhir.mapping.hml;

/**
 * Created by Andrew S. Brown, Ph.D., <andrew@nmdp.org>, on 5/31/17.
 * <p>
 * hml-fhir
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
import org.nmdp.hmlfhir.mapping.Distinct;
import org.nmdp.hmlfhirconvertermodels.domain.fhir.*;
import org.nmdp.hmlfhirconvertermodels.dto.*;
import org.nmdp.hmlfhirconvertermodels.dto.SbtNgs;
import org.nmdp.hmlfhirconvertermodels.lists.SbtNgss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SbtNgsMap implements Converter<FhirMessage, SbtNgss> {

    @Override
    public SbtNgss convert(MappingContext<FhirMessage, SbtNgss> context) {
        if (context.getSource() == null) {
            return null;
        }

        SbtNgss sbtNgss = new SbtNgss();
        List<SbtNgs> sbtNgsList = new ArrayList<>();
        FhirMessage fhir = context.getSource();
//        org.nmdp.hmlfhirconvertermodels.domain.fhir.lists.SbtNgss fhirSbtNgss = fhir.getSbtNgss();
//
//        for (org.nmdp.hmlfhirconvertermodels.domain.fhir.SbtNgs sbtNgs : fhirSbtNgss.getSbtNgss()) {
//            SbtNgs hmlSbtNgs = new SbtNgs();
//
//            hmlSbtNgs.setLocus(sbtNgs.getLocus());
//            sbtNgsList.add(hmlSbtNgs);
//        }

        sbtNgss.setSbtNgss(sbtNgsList);

        return sbtNgss;
    }
}
