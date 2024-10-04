package com.nt.generator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class Mygenerator implements IdentifierGenerator {

	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		/*String prefix = "SBI";
		String suffix = "";
		
		try {
			Connection con = session.connection();
			Statement stmt =con.createStatement();
			String sql = "select count(order_id)as Id from boot.order_entity";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				Long id=rs.getLong(1)+33587336222L;
                String generatedId = prefix + new Long(id).toString();
                System.out.println("Generated Id: " + generatedId);
                return generatedId;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/
		String pref="SHIP-";
		String dte=new SimpleDateFormat("ddMMyyyy").format(new Date());
		int random=new Random().nextInt(10);
		return pref+dte+"-"+random;
	}
}
