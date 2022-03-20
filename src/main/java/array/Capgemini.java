/*
package com.ahasan.arraysdemo.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Capgemini {



	public static void main(String[] args) {


		List customerProfiles = new ArrayList<>();


		customerProfiles.stream().filter(Campaign::isActive).map(Participant::getParticipants).
				forEach( p ->{
					if(p.getCampaignCode() == 1) {
						customerProfiles.add(p.getCustomerProfile());
					}
				}
		);



		for (Campaign c : campaigns) {

			if (c.isActive()) {

				for (Participant p : c.getParticipants()) {

					if (p.getCampaignCode() == 1) {

						customerProfiles.add(p.getCustomerProfile());

					}

				}

			}

		}


	}
}
*/
