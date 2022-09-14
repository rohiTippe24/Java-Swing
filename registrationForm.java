//  Create Registration Form For Searching Jobs

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements ActionListener {
  Container c;
  JLabel title ,  name , education , mono , email , gender , lang , language , state , country , gp , xp , adr , hb;
  JTextArea address , Hobi , exp;
  JButton register;
  JComboBox langCombo , stateCombo , countryCombo , year;
  JRadioButton  male , female , trans;
  JCheckBox marathi , hindi , english ;
  JTextField nameinp , educationinp , monoinp , gmailinp ;
  JButton btn;
  
  myFrame (String t) {
    this.setTitle(t);
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    c = this.getContentPane();
    c.setLayout(null);
    
    title = new JLabel("Free Register to find Jobs near You...");
    title.setBounds(140 , 10 , 600 , 50);
    title.setFont(f);
    title.setForeground(Color.BLUE);
    c.add(title);
    
    name = new JLabel("Name  :-  ");
    name.setBounds(50 , 80 , 200 , 50);
    name.setFont(f);
    c.add(name);
    
    nameinp = new JTextField();
    nameinp.setBounds(180 , 80 , 300 , 40);
    nameinp.setFont(f);
    c.add(nameinp);
    
    
    education = new JLabel("Education  :-  ");
    education.setFont(f);
    education.setBounds(50 , 160 , 200 , 50);
    c.add(education);
    
    educationinp = new JTextField();
    educationinp.setBounds(230 , 160 , 300 , 40);
    educationinp.setFont(f);
    c.add(educationinp);
    
    mono = new JLabel("Mobile Number  :-  ");
    mono.setBounds(50 , 240 , 400 , 50);
    mono.setFont(f);
    c.add(mono);
    
    monoinp = new JTextField();
    monoinp.setBounds(280 , 240 , 250 , 40);
    monoinp.setFont(f);
    c.add(monoinp);
    
    email = new JLabel("Gmail Address  :-  ");
    email.setBounds(50 , 320 , 400 , 50);
    email.setFont(f);
    c.add(email);
    
    gmailinp = new JTextField();
    gmailinp.setBounds(280 , 320 , 400 , 40);
    gmailinp.setFont(f);
    c.add(gmailinp);
    
    gender = new JLabel("Gender  :-  ");
    gender.setBounds(50 , 400 , 200 , 50);
    gender.setFont(f);
    c.add(gender);
    
    male = new JRadioButton("  Male  ");
    male.setBounds(200 , 400 , 200 , 50);
    male.setFont(f);
    c.add(male);
    
    female = new JRadioButton("  Female  ");
    female.setBounds(400 ,400 , 200 , 50);
    female.setFont(f);
    c.add(female);
    
    ButtonGroup gen = new ButtonGroup();
    gen.add(male);
    gen.add(female);
    
    
    lang = new JLabel("Programing Language  :-  ");
    lang.setBounds(50 , 480 , 400 , 50);
    lang.setFont(f);
    c.add(lang);
    
    String plang[] = {"Python" , "Java" , "JavaScript" , "C#" , "Kotlin" , "Rubi" , "ASP.Net" , "C++" , "C Language" , "Swift" };
    
    langCombo = new JComboBox(plang);
    langCombo.setBounds(380 , 480 , 200 , 40);
    langCombo.setFont(f);
    c.add(langCombo);
    
    language = new JLabel("Mother-Toung  :-  ");
    language.setFont(f);
    language.setBounds(50 , 560 , 400 , 50);
    c.add(language);
    
    marathi = new JCheckBox("  Marathi  ");
    marathi.setFont(f);
    marathi.setBounds(300 , 560 , 150 , 40 );
    c.add(marathi);
    
    hindi = new JCheckBox("  Hindi  ");
    hindi.setBounds(450 , 560 , 150 , 40);
    hindi.setFont(f);
    c.add(hindi);
    
    english = new JCheckBox("  English  ");
    english.setBounds(600 , 560 , 150 , 40);
    english.setFont(f);
    c.add(english);
    
    state = new JLabel("State  :- ");
    state.setBounds(800 , 80 , 200 , 50);
    state.setFont(f);
    c.add(state);
    
    String statearr[] = {
      "Andhra Pradesh",
                "Arunachal Pradesh",
                "Assam",
                "Bihar",
                "Chhattisgarh",
                "Goa",
                "Gujarat",
                "Haryana",
                "Himachal Pradesh",
                "Jammu and Kashmir",
                "Jharkhand",
                "Karnataka",
                "Kerala",
                "Madhya Pradesh",
                "Maharashtra",
                "Manipur",
                "Meghalaya",
                "Mizoram",
                "Nagaland",
                "Odisha",
                "Punjab",
                "Rajasthan",
                "Sikkim",
                "Tamil Nadu",
                "Telangana",
                "Tripura",
                "Uttarakhand",
                "Uttar Pradesh",
                "West Bengal",
                "Andaman and Nicobar Islands",
                "Chandigarh",
                "Dadra and Nagar Haveli",
                "Daman and Diu",
                "Delhi",
                "Lakshadweep",
                "Puducherry"
    };
    
    stateCombo = new JComboBox(statearr);
    stateCombo.setBounds(930 , 80 , 250 , 50);
    stateCombo.setFont(f);
    c.add(stateCombo);
    
    country = new JLabel("Country  :-  ");
    country.setBounds(1200 , 80 , 200 , 50);
    country.setFont(f);
    c.add(country);
    
    String countryarr[] = { "Afghanistan",
	"Albania",
	"Algeria",
	"American Samoa",
	"Andorra",
	"Angola",
	"Anguilla",
	"Antarctica",
	"Antigua and Barbuda",
	"Argentina",
	"Armenia",
	"Aruba",
	"Australia",
	"Austria",
	"Azerbaijan",
	"Bahamas (the)",
	"Bahrain",
	"Bangladesh",
	"Barbados",
	"Belarus",
	"Belgium",
	"Belize",
	"Benin",
	"Bermuda",
	"Bhutan",
	"Bolivia (Plurinational State of)",
	"Bonaire, Sint Eustatius and Saba",
	"Bosnia and Herzegovina",
	"Botswana",
	"Bouvet Island",
	"Brazil",
	"British Indian Ocean Territory (the)",
	"Brunei Darussalam",
	"Bulgaria",
	"Burkina Faso",
	"Burundi",
	"Cabo Verde",
	"Cambodia",
	"Cameroon",
	"Canada",
	"Cayman Islands (the)",
	"Central African Republic (the)",
	"Chad",
	"Chile",
	"China",
	"Christmas Island",
	"Cocos (Keeling) Islands (the)",
	"Colombia",
	"Comoros (the)",
	"Congo (the Democratic Republic of the)",
	"Congo (the)",
	"Cook Islands (the)",
	"Costa Rica",
	"Croatia",
	"Cuba",
	"Curaçao",
	"Cyprus",
	"Czechia",
	"Côte d'Ivoire",
	"Denmark",
	"Djibouti",
	"Dominica",
	"Dominican Republic (the)",
	"Ecuador",
	"Egypt",
	"El Salvador",
	"Equatorial Guinea",
	"Eritrea",
	"Estonia",
	"Eswatini",
	"Ethiopia",
	"Falkland Islands (the) [Malvinas]",
	"Faroe Islands (the)",
	"Fiji",
	"Finland",
	"France",
	"French Guiana",
	"French Polynesia",
	"French Southern Territories (the)",
	"Gabon",
	"Gambia (the)",
	"Georgia",
	"Germany",
	"Ghana",
	"Gibraltar",
	"Greece",
	"Greenland",
	"Grenada",
	"Guadeloupe",
	"Guam",
	"Guatemala",
	"Guernsey",
	"Guinea",
	"Guinea-Bissau",
	"Guyana",
	"Haiti",
	"Heard Island and McDonald Islands",
	"Holy See (the)",
	"Honduras",
	"Hong Kong",
	"Hungary",
	"Iceland",
	"India",
	"Indonesia",
	"Iran (Islamic Republic of)",
	"Iraq",
	"Ireland",
	"Isle of Man",
	"Israel",
	"Italy",
	"Jamaica",
	"Japan",
	"Jersey",
	"Jordan",
	"Kazakhstan",
	"Kenya",
	"Kiribati",
	"Korea (the Democratic People's Republic of)",
	"Korea (the Republic of)",
	"Kuwait",
	"Kyrgyzstan",
	"Lao People's Democratic Republic (the)",
	"Latvia",
	"Lebanon",
	"Lesotho",
	"Liberia",
	"Libya",
	"Liechtenstein",
	"Lithuania",
	"Luxembourg",
	"Macao",
	"Madagascar",
	"Malawi",
	"Malaysia",
	"Maldives",
	"Mali",
	"Malta",
	"Marshall Islands (the)",
	"Martinique",
	"Mauritania",
	"Mauritius",
	"Mayotte",
	"Mexico",
	"Micronesia (Federated States of)",
	"Moldova (the Republic of)",
	"Monaco",
	"Mongolia",
	"Montenegro",
	"Montserrat",
	"Morocco",
	"Mozambique",
	"Myanmar",
	"Namibia",
	"Nauru",
	"Nepal",
	"Netherlands (the)",
	"New Caledonia",
	"New Zealand",
	"Nicaragua",
	"Niger (the)",
	"Nigeria",
	"Niue",
	"Norfolk Island",
	"Northern Mariana Islands (the)",
	"Norway",
	"Oman",
	"Pakistan",
	"Palau",
	"Palestine, State of",
	"Panama",
	"Papua New Guinea",
	"Paraguay",
	"Peru",
	"Philippines (the)",
	"Pitcairn",
	"Poland",
	"Portugal",
	"Puerto Rico",
	"Qatar",
	"Republic of North Macedonia",
	"Romania",
	"Russian Federation (the)",
	"Rwanda",
	"Réunion",
	"Saint Barthélemy",
	"Saint Helena, Ascension and Tristan da Cunha",
	"Saint Kitts and Nevis",
	"Saint Lucia",
	"Saint Martin (French part)",
	"Saint Pierre and Miquelon",
	"Saint Vincent and the Grenadines",
	"Samoa",
	"San Marino",
	"Sao Tome and Principe",
	"Saudi Arabia",
	"Senegal",
	"Serbia",
	"Seychelles",
	"Sierra Leone",
	"Singapore",
	"Sint Maarten (Dutch part)",
	"Slovakia",
	"Slovenia",
	"Solomon Islands",
	"Somalia",
	"South Africa",
	"South Georgia and the South Sandwich Islands",
	"South Sudan",
	"Spain",
	"Sri Lanka",
	"Sudan (the)",
	"Suriname",
	"Svalbard and Jan Mayen",
	"Sweden",
	"Switzerland",
	"Syrian Arab Republic",
	"Taiwan",
	"Tajikistan",
	"Tanzania, United Republic of",
	"Thailand",
	"Timor-Leste",
	"Togo",
	"Tokelau",
	"Tonga",
	"Trinidad and Tobago",
	"Tunisia",
	"Turkey",
	"Turkmenistan",
	"Turks and Caicos Islands (the)",
	"Tuvalu",
	"Uganda",
	"Ukraine",
	"United Arab Emirates (the)",
	"United Kingdom of Great Britain and Northern Ireland (the)",
	"United States Minor Outlying Islands (the)",
	"United States of America (the)",
	"Uruguay",
	"Uzbekistan",
	"Vanuatu",
	"Venezuela (Bolivarian Republic of)",
	"Viet Nam",
	"Virgin Islands (British)",
	"Virgin Islands (U.S.)",
	"Wallis and Futuna",
	"Western Sahara",
	"Yemen",
	"Zambia",
	"Zimbabwe",
	"Åland Islands"
 };
    
    countryCombo = new JComboBox(countryarr);
    countryCombo.setBounds(1350 , 80 , 250 , 50);
    countryCombo.setFont(f);
    c.add(countryCombo);
    
    gp = new JLabel("Degree Passing Year  :-  ");
    gp.setBounds(800 , 160 , 400 , 50);
    gp.setFont(f);
    c.add(gp);
    
    String yeararry[] = {"1900" , "1991" , "1992" , "1993" , "1994" , "1995" , "1996" , "1997" , "1998" , "1999" , "2000" , "2001" , "2002" , "2003" , "2004" , "2005" , "2006" , "2007" , "2008" , "2009" , "2010" , "2011" , "2012" , "2013" , "2014" , "2015" , "2016" , "2017" , "2018" , "2019" , "2020" , "2021" , "2022" , "2023" , "2024" , "2025"};
    
    year = new JComboBox(yeararry);
    year.setBounds(1100 , 160 , 120 , 50);
    year.setFont(f);
    c.add(year);
    
    xp = new JLabel("Experience  :-  ");
    xp.setFont(f);
    xp.setBounds(800 , 240 , 200 , 50);
    c.add(xp);
    
    exp = new JTextArea();
    exp.setBounds(1000 , 240 , 400 , 100);
    exp.setFont(f);
    exp.setBackground(Color.YELLOW);
    c.add(exp);
    
   hb = new JLabel("Hobbi   ");
   hb.setFont(f);
   hb.setBounds(920 , 380 , 200 , 50);
   c.add(hb);
   
   Hobi = new JTextArea();
   Hobi.setBounds(800 , 420 , 350 , 150);
   Hobi.setFont(f);
   Hobi.setBackground(Color.YELLOW);
   c.add(Hobi);
   
   adr = new JLabel("Address  ");
   adr.setBounds(1430 , 380 , 200 , 50);
   adr.setFont(f);
   c.add(adr);
    
   address = new JTextArea();
   address.setBounds(1300 , 420 , 350 , 150);
   address.setFont(f);
   address.setBackground(Color.YELLOW);
   c.add(address);
    
    btn = new JButton("  Submit  ");
    btn.setBounds(1400 , 600 , 180 , 50);
    btn.setFont(f);
    btn.setForeground(Color.RED);
    btn.addActionListener(this);
    btn.setVisible(true);
    c.add(btn);
  }
  
  public void actionPerformed (ActionEvent e) {
    
    System.out.println("name :-  " + nameinp.getText() );
    System.out.println("Mobile Number :-  " + monoinp.getText() );
    System.out.println("Education :-  " + educationinp.getText() );
    System.out.println("Gmail Address :-  " + gmailinp.getText() );
    System.out.println("Programing Language :-  " + langCombo.getSelectedItem() );
    System.out.println("state :-  " + stateCombo.getSelectedItem());
    System.out.println("Country :-  " + countryCombo.getSelectedItem() );
    System.out.println("Degree Passing :-  " + year.getSelectedItem() );
    System.out.println("Hobi :-  " + Hobi.getText() );
    System.out.println("Address :-  " + address.getText() );
    
    String gdr = " ";
    
    if (male.isSelected()) {
      gdr = "Male";
    } else if (female.isSelected()) {
      gdr = "female";
    } else if (trans.isSelected()) {
      gdr = "Trans Gender";
    }
    
    System.out.println("Gender :-  " + gdr );
    
    String ml = " ";
    
    if (marathi.isSelected()) {
      ml = "Marathi";
    } else if (hindi.isSelected()) {
      ml = "Hindi";
    } else if (english.isSelected()) {
      ml = "English";
    }
    
    System.out.println("Mother-Toung :-  " + ml  );
    
    btn.setText("Submited");
    
    nameinp.setText("") ;
    monoinp.setText("") ;
    educationinp.setText("") ; 
    gmailinp.setText("") ;
    Hobi.setText("") ;
    address.setText("") ;
    
  }
  
}

public class registrationForm {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame("Registration Form");
    frame.setBounds(0 , 0 , 1500 , 8000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  
}
