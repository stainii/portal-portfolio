package be.stijnhooft.portal.portfolio.mothers;

import be.stijnhooft.portal.portfolio.model.BlogPost;

import java.time.LocalDate;
import java.util.Arrays;

public class BlogPostMother {

    public static BlogPost complete() {
        return new BlogPost("alternative-ways-to-log-in",
            "Alternative ways to log in, which can be implemented today",
            "<p>ZDNet has published that, <a href=\"http://www.zdnet.com/pictures/biggest-hacks-security-data-breaches-2016\" target=\"_blank\">in 2016 alone, almost 300 data breaches were made public, resulting in 2.2 billion stolen data records</a>. Every year again, this is, and stays, a big issue. This is a [description].</p>\n",
            "<img src=\"data/blogposts/alternative-ways-to-log-in/clef.png\"></img>",
            "<portfolio-article _ngcontent-khm-22=\"\" _nghost-khm-10=\"\" ng-reflect-data=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-10=\"\">\n" +
                "    <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object],[object Object]\"\n" +
                "}--><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>ZDNet has published that, <a href=&quot;http://www.zdnet.com/pictures/biggest-hacks-security-data-breaches-2016&quot; target=&quot;_blank&quot;>in 2016 alone, almost 300 data breaches were made public, resulting in 2.2 billion stolen data records</a>. Every year again, this is, and stays, a big issue.</p>&amp;#10;&amp;#10;<p>As developers, we have <strong>a duty to protect the data of our users</strong>.  Since biometrical iris sensors or digital DNA tests are not (yet) in the hands of everyone, <strong>how can we improve our authentication process TODAY</strong>?</p>&amp;#10;&amp;#10;<h2>Fancy new ways to log in and two-factor authentication</h2>&amp;#10;&amp;#10;<p>You can authenticate yourself by 3 means:&amp;#10;&amp;#10;</p><ol>&amp;#10;<li><strong>What you know</strong>: passwords, &amp;#8220;secret&amp;#8221; questions</li>&amp;#10;<li><strong>What you have</strong>: hardware tokens, eID</li>&amp;#10;<li><strong>What you &amp;#34;are&amp;#34;</strong>: biometrics</li></ol><p></p>&amp;#10;\"><p>ZDNet has published that, <a href=\"http://www.zdnet.com/pictures/biggest-hacks-security-data-breaches-2016\" target=\"_blank\">in 2016 alone, almost 300 data breaches were made public, resulting in 2.2 billion stolen data records</a>. Every year again, this is, and stays, a big issue.</p>\n" +
                "\n" +
                "<p>As developers, we have <strong>a duty to protect the data of our users</strong>.  Since biometrical iris sensors or digital DNA tests are not (yet) in the hands of everyone, <strong>how can we improve our authentication process TODAY</strong>?</p>\n" +
                "\n" +
                "<h2>Fancy new ways to log in and two-factor authentication</h2>\n" +
                "\n" +
                "<p>You can authenticate yourself by 3 means:\n" +
                "\n" +
                "</p><ol>\n" +
                "<li><strong>What you know</strong>: passwords, “secret” questions</li>\n" +
                "<li><strong>What you have</strong>: hardware tokens, eID</li>\n" +
                "<li><strong>What you \"are\"</strong>: biometrics</li></ol><p></p>\n" +
                "</div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><div _ngcontent-khm-13=\"\" ng-reflect-inner-h-t-m-l=\"<img src=&quot;data/blogposts/alternative-ways-to-log-in/security-lock.jpg&quot; alt=&quot;Ear shape identitification&quot;>\"><img src=\"data/blogposts/alternative-ways-to-log-in/security-lock.jpg\" alt=\"Ear shape identitification\"></div>\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}--></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>In order to <strong>make it more difficult to steal</strong> your identity, security experts advise to <strong>combine</strong> at least 2 of these means. This is called <strong>2-factor authentication</strong>. Maybe someone can guess or steal your password, but the thief will find it far more difficult to steal your phone, your eID or the shape of your ear!</p>&amp;#10;&amp;#10;<p>One drawback: needing to authenticate in multiple way raises <strong>barriers</strong> for potential users to use your app. Having to remember a password is already &amp;#8220;a pain&amp;#8221;, but if you also need to search your phone, eID card, &amp;#8230; In my opinion, developers and analysts should think carefully about what a user can do without authenticating, and what absolutely needs to be protected.&amp;#10;&amp;#10;</p><p>Let&amp;#8217;s see which kinds of authentication frameworks are <strong>available today</strong>, and what barriers they form.</p>&amp;#10;&amp;#10;<h2>What you have</h2>&amp;#10;<h3>SMS, voice call</h3>\"><p>In order to <strong>make it more difficult to steal</strong> your identity, security experts advise to <strong>combine</strong> at least 2 of these means. This is called <strong>2-factor authentication</strong>. Maybe someone can guess or steal your password, but the thief will find it far more difficult to steal your phone, your eID or the shape of your ear!</p>\n" +
                "\n" +
                "<p>One drawback: needing to authenticate in multiple way raises <strong>barriers</strong> for potential users to use your app. Having to remember a password is already “a pain”, but if you also need to search your phone, eID card, … In my opinion, developers and analysts should think carefully about what a user can do without authenticating, and what absolutely needs to be protected.\n" +
                "\n" +
                "</p><p>Let’s see which kinds of authentication frameworks are <strong>available today</strong>, and what barriers they form.</p>\n" +
                "\n" +
                "<h2>What you have</h2>\n" +
                "<h3>SMS, voice call</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><div _ngcontent-khm-13=\"\" ng-reflect-inner-h-t-m-l=\"<p><i>You can read more about two-factor authentication <a href=&quot;http://www.welivesecurity.com/2014/02/11/two-factor-authentication-what-is-it-and-why-do-i-need-it/&quot; target=&quot;_blank&quot;>here</a>.</i></p>\"><p><i>You can read more about two-factor authentication <a href=\"http://www.welivesecurity.com/2014/02/11/two-factor-authentication-what-is-it-and-why-do-i-need-it/\" target=\"_blank\">here</a>.</i></p></div>\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}--></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"Apple, Google, Facebook, Twitter, &amp;#8230; most big tech companies have already implemented an (optional) 2-factor authentication. Most of them request the combination of email/username + password <i>(what you know)</i> and a temporary code sent via <strong>sms</strong> <i>(what you have)</i>. If you cannot receive an sms, you can also ask to <strong>get called</strong> by a bot, dictating you a code.<p></p>&amp;#10;&amp;#10;<p>This is something <strong>we can implement too, without having to own expensive equipment</strong>. <a href=&quot;https://www.twilio.com&quot;>Twilio</a>  is an awesome service which offers a rich API, <strong>with which you can send sms messages or configure a phone bot</strong>. Prices are reasonable.&amp;#10;&amp;#10;</p><table><tbody><tr><td>&amp;#10;<img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;></td><td>&amp;#10;This does form barriers from a user-perspective:&amp;#10;<ul>&amp;#10;<li>you need access to your phone</li>&amp;#10;<li>there is a certain delay between sending and receiving a text message</li>&amp;#10;<li>you need to have a cell signal</li></ul></td></tr></tbody></table>\">Apple, Google, Facebook, Twitter, … most big tech companies have already implemented an (optional) 2-factor authentication. Most of them request the combination of email/username + password <i>(what you know)</i> and a temporary code sent via <strong>sms</strong> <i>(what you have)</i>. If you cannot receive an sms, you can also ask to <strong>get called</strong> by a bot, dictating you a code.<p></p>\n" +
                "\n" +
                "<p>This is something <strong>we can implement too, without having to own expensive equipment</strong>. <a href=\"https://www.twilio.com\">Twilio</a>  is an awesome service which offers a rich API, <strong>with which you can send sms messages or configure a phone bot</strong>. Prices are reasonable.\n" +
                "\n" +
                "</p><table><tbody><tr><td>\n" +
                "<img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\"></td><td>\n" +
                "This does form barriers from a user-perspective:\n" +
                "<ul>\n" +
                "<li>you need access to your phone</li>\n" +
                "<li>there is a certain delay between sending and receiving a text message</li>\n" +
                "<li>you need to have a cell signal</li></ul></td></tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><video _ngcontent-khm-13=\"\" controls=\"\">\n" +
                "    <source _ngcontent-khm-13=\"\" ng-reflect-src=\"data/blogposts/alternative-ways-to-log-in/sms.mp4\" src=\"data/blogposts/alternative-ways-to-log-in/sms.mp4\">\n" +
                "</video></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>Scan an image</h3>\"><h3>Scan an image</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>Instead of sending a temporary code, you can also integrate with a service like <a href=&quot;https://getclef.com&quot; target=&quot;_blank&quot;>Clef</a>.&amp;#10;Clefs generates a <strong>temporary (moving) image</strong>, which you can put on your website/application. To log in, the user needs to <strong>scan that image with the Clef app</strong>.</p>&amp;#10;&amp;#10;<p>First, the user&amp;#10;</p><ol>&amp;#10;<li>downloads the Clef app</li>&amp;#10;<li>registers with Clef. This is no more than entering your email address and choosing a PIN code.</li>&amp;#10;<li>from then on, he or she can log in on your website, by opening the Clef app and scanning your image.</li>&amp;#10;</ol><p></p>&amp;#10;<p>Of course, there are a lot of alternative to Clef. MyDigipass, for example, lets users log in with the more familiar <strong>QR code</strong>.</p>&amp;#10;&amp;#10;<table><tbody><tr>&amp;#10;<td><img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;></td>&amp;#10;<td>The barriers to logging in with services like Clef and MyDigipass are higher, since users need&amp;#10;<ul>&amp;#10;<li>to download an app</li>&amp;#10;<li>to users register at a service &amp;#34;they don&amp;#8217;t need&amp;#8221;</li>&amp;#10;<li>to have their (charged) smartphone on them</li>&amp;#10;<li>an internet connection</li></ul></td>&amp;#10;</tr></tbody></table>\"><p>Instead of sending a temporary code, you can also integrate with a service like <a href=\"https://getclef.com\" target=\"_blank\">Clef</a>.\n" +
                "Clefs generates a <strong>temporary (moving) image</strong>, which you can put on your website/application. To log in, the user needs to <strong>scan that image with the Clef app</strong>.</p>\n" +
                "\n" +
                "<p>First, the user\n" +
                "</p><ol>\n" +
                "<li>downloads the Clef app</li>\n" +
                "<li>registers with Clef. This is no more than entering your email address and choosing a PIN code.</li>\n" +
                "<li>from then on, he or she can log in on your website, by opening the Clef app and scanning your image.</li>\n" +
                "</ol><p></p>\n" +
                "<p>Of course, there are a lot of alternative to Clef. MyDigipass, for example, lets users log in with the more familiar <strong>QR code</strong>.</p>\n" +
                "\n" +
                "<table><tbody><tr>\n" +
                "<td><img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\"></td>\n" +
                "<td>The barriers to logging in with services like Clef and MyDigipass are higher, since users need\n" +
                "<ul>\n" +
                "<li>to download an app</li>\n" +
                "<li>to users register at a service \"they don’t need”</li>\n" +
                "<li>to have their (charged) smartphone on them</li>\n" +
                "<li>an internet connection</li></ul></td>\n" +
                "</tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><video _ngcontent-khm-13=\"\" controls=\"\">\n" +
                "    <source _ngcontent-khm-13=\"\" ng-reflect-src=\"data/blogposts/alternative-ways-to-log-in/clef.mp4\" src=\"data/blogposts/alternative-ways-to-log-in/clef.mp4\">\n" +
                "</video></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>Identity card</h3>\"><h3>Identity card</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>In most countries, citizens need to possess an identity card. For governmental services, this is the <i>de facto standard</i> of identification. Can&amp;#8217;t we all start identifying ourselves by the card, which is <strong>already in our pocket?</strong></p>&amp;#10;<p>Governments have started opening up this possibility, but <strong>good implementations are rare to find</strong>.</p>&amp;#10;<p><a href=&quot;https://www.mydigipass.com&quot;>MyDigipass</a> offers a great <strong>oAuth2</strong> implementation for <strong>Belgium</strong>. Since it's an oAuth2 flow, for end users, it feels like logging in with their Facebook account. For business, it&amp;#8217;s a way to retrieve <strong>trustworthy information</strong>.</p>&amp;#10;&amp;#10;<table><tbody><tr>&amp;#10;<td><img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;></td>&amp;#10;<td>The barriers?&amp;#10;<ul><li><strong>trust</strong>! A lot of information can be extracted from electronic ids. People generally know this, and are (hopefully) very careful using their electronic id.</li>&amp;#10;<li>every country has its own form of electronic id. <strong>For every country </strong> your service is targeting, you need to <strong>implement another API</strong>.</li>&amp;#10;<li>in order to extract data from an eID, people often need to have certain <strong>hardware</strong>.</li>&amp;#10;<li>Possibly, the user needs to <strong>install drivers</strong> or bridging software, to make this device work</li>&amp;#10;<li>You probably cannot connect this device to a <strong>smartphone</strong></li></ul></td></tr></tbody></table>&amp;#10;\"><p>In most countries, citizens need to possess an identity card. For governmental services, this is the <i>de facto standard</i> of identification. Can’t we all start identifying ourselves by the card, which is <strong>already in our pocket?</strong></p>\n" +
                "<p>Governments have started opening up this possibility, but <strong>good implementations are rare to find</strong>.</p>\n" +
                "<p><a href=\"https://www.mydigipass.com\">MyDigipass</a> offers a great <strong>oAuth2</strong> implementation for <strong>Belgium</strong>. Since it's an oAuth2 flow, for end users, it feels like logging in with their Facebook account. For business, it’s a way to retrieve <strong>trustworthy information</strong>.</p>\n" +
                "\n" +
                "<table><tbody><tr>\n" +
                "<td><img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\"></td>\n" +
                "<td>The barriers?\n" +
                "<ul><li><strong>trust</strong>! A lot of information can be extracted from electronic ids. People generally know this, and are (hopefully) very careful using their electronic id.</li>\n" +
                "<li>every country has its own form of electronic id. <strong>For every country </strong> your service is targeting, you need to <strong>implement another API</strong>.</li>\n" +
                "<li>in order to extract data from an eID, people often need to have certain <strong>hardware</strong>.</li>\n" +
                "<li>Possibly, the user needs to <strong>install drivers</strong> or bridging software, to make this device work</li>\n" +
                "<li>You probably cannot connect this device to a <strong>smartphone</strong></li></ul></td></tr></tbody></table>\n" +
                "</div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><video _ngcontent-khm-13=\"\" controls=\"\">\n" +
                "    <source _ngcontent-khm-13=\"\" ng-reflect-src=\"data/blogposts/alternative-ways-to-log-in/myDigipass.mp4\" src=\"data/blogposts/alternative-ways-to-log-in/myDigipass.mp4\">\n" +
                "</video></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>USB key</h3>\"><h3>USB key</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>Almost every digital device, like computers, tablets, smartphones, have some kind of USB port. What if there is a USB device that can act as a <strong>physical key</strong>?</p>&amp;#10;&amp;#10;<p>Such &amp;#8220;USB keys&amp;#8221; do exist. An example is <a href=&quot;https://trezor.io&quot; target=&quot;_blank&quot;>Trezor</a>. This key is has become well known as a Bitcoin wallet, but can be used to authenticate in any kind of service.</p>&amp;#10;&amp;#10;<table><tbody><tr><td>&amp;#10;<img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;>&amp;#10;</td>&amp;#10;<td>&amp;#10;Unfortunately, using a USB key comes with steep barriers:&amp;#10;<li>the user needs to <strong>buy</strong> such device.</li>&amp;#10;<li>the devices needs to be <strong>brought along everywhere</strong></li>&amp;#10;<li>not all hardware allows browsers or apps to have <strong>access to the USB port</strong> <i>- yes, I&amp;#8217;m looking at you, Apple!</i></li>&amp;#10;&amp;#10;&amp;#10;</td></tr></tbody></table>\"><p>Almost every digital device, like computers, tablets, smartphones, have some kind of USB port. What if there is a USB device that can act as a <strong>physical key</strong>?</p>\n" +
                "\n" +
                "<p>Such “USB keys” do exist. An example is <a href=\"https://trezor.io\" target=\"_blank\">Trezor</a>. This key is has become well known as a Bitcoin wallet, but can be used to authenticate in any kind of service.</p>\n" +
                "\n" +
                "<table><tbody><tr><td>\n" +
                "<img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\">\n" +
                "</td>\n" +
                "<td>\n" +
                "Unfortunately, using a USB key comes with steep barriers:\n" +
                "<li>the user needs to <strong>buy</strong> such device.</li>\n" +
                "<li>the devices needs to be <strong>brought along everywhere</strong></li>\n" +
                "<li>not all hardware allows browsers or apps to have <strong>access to the USB port</strong> <i>- yes, I’m looking at you, Apple!</i></li>\n" +
                "\n" +
                "\n" +
                "</td></tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><div _ngcontent-khm-13=\"\" ng-reflect-inner-h-t-m-l=\"<img src=&quot;data/blogposts/alternative-ways-to-log-in/usb_key.png&quot; alt=&quot;USB key Trezor&quot;>\"><img src=\"data/blogposts/alternative-ways-to-log-in/usb_key.png\" alt=\"USB key Trezor\"></div>\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}--></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h2>What you are</h2>&amp;#10;<p>Our bodies also have unique properties, which can be recognised and used for authentication. Technology has still a long way to go in this field. Still, some services are already available today, for developers to use.</p>&amp;#10;&amp;#10;<p>Note that biometrics can also be stolen or replicated, as described well on <a href=&quot;http://stackoverflow.com/questions/4169678/can-i-use-a-fingerprint-scanner-on-my-website&quot; target=&quot;_blank&quot;>this Stack overflow thread</a>. Everyone can lift fingerprints. (Basic) facial recognition is easily spoofed by a photo or video. Use biometrics <strong>only as an <u>extra</u> layer</strong> of authentication.</p>\"><h2>What you are</h2>\n" +
                "<p>Our bodies also have unique properties, which can be recognised and used for authentication. Technology has still a long way to go in this field. Still, some services are already available today, for developers to use.</p>\n" +
                "\n" +
                "<p>Note that biometrics can also be stolen or replicated, as described well on <a href=\"http://stackoverflow.com/questions/4169678/can-i-use-a-fingerprint-scanner-on-my-website\" target=\"_blank\">this Stack overflow thread</a>. Everyone can lift fingerprints. (Basic) facial recognition is easily spoofed by a photo or video. Use biometrics <strong>only as an <u>extra</u> layer</strong> of authentication.</p></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>Heartbeat</h3>\"><h3>Heartbeat</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>The <a href=&quot;https://nymi.com/product_overview&quot; target=&quot;_blank&quot;>Nymi band</a> is a wearable authenticator wich recognises your heart beat. More specifically, the band determines your <strong>electrocardiogram (ECG)</strong>.</p>&amp;#10;&amp;#10;<p>Nymi claims an ECG is, just as a fingerprint, <strong>unique</strong>. Studies (like <a href=&quot;https://www.physionet.org/pn3/ecgiddb/biometric.shtml&quot; target=&quot;_blank&quot;>this one</a>) seem to confirm this claim. Your heart rate does have an impact on the shape of the ECG, but the ECG can be <strong>normalised</strong>, so that you can make a reliable comparison. Although, ECGs are unique in a small group of people, but we don't know if it's really unique in a world's population.</p>&amp;#10;&amp;#10;<p>When the band has determined your identity, the band connects via Bluetooth or NFC to pass on your authentication.</p>&amp;#10;&amp;#10;<table><tbody><tr><td>&amp;#10;<img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;>&amp;#10;</td><td>&amp;#10;This way of authentication has the same barriers as bringing along an USB key.&amp;#10;</td></tr></tbody></table>\"><p>The <a href=\"https://nymi.com/product_overview\" target=\"_blank\">Nymi band</a> is a wearable authenticator wich recognises your heart beat. More specifically, the band determines your <strong>electrocardiogram (ECG)</strong>.</p>\n" +
                "\n" +
                "<p>Nymi claims an ECG is, just as a fingerprint, <strong>unique</strong>. Studies (like <a href=\"https://www.physionet.org/pn3/ecgiddb/biometric.shtml\" target=\"_blank\">this one</a>) seem to confirm this claim. Your heart rate does have an impact on the shape of the ECG, but the ECG can be <strong>normalised</strong>, so that you can make a reliable comparison. Although, ECGs are unique in a small group of people, but we don't know if it's really unique in a world's population.</p>\n" +
                "\n" +
                "<p>When the band has determined your identity, the band connects via Bluetooth or NFC to pass on your authentication.</p>\n" +
                "\n" +
                "<table><tbody><tr><td>\n" +
                "<img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\">\n" +
                "</td><td>\n" +
                "This way of authentication has the same barriers as bringing along an USB key.\n" +
                "</td></tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><div _ngcontent-khm-13=\"\" ng-reflect-inner-h-t-m-l=\"<img src=&quot;data/blogposts/alternative-ways-to-log-in/heartbeat_band.jpg&quot; alt=&quot;This Nyme band measures your heart beat in order to be able to authenticate you&quot;>\"><img src=\"data/blogposts/alternative-ways-to-log-in/heartbeat_band.jpg\" alt=\"This Nyme band measures your heart beat in order to be able to authenticate you\"></div>\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}--></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>The shape of your ear</h3>\"><h3>The shape of your ear</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>We know that fingerprints do not tend to change. However, there are more parts of our body that are stable, like the shape of our ears. What if we could authenticate ourselves by <strong>holding a phone to our ear</strong>?</p>&amp;#10;<p><a href=&quot;http://www.descartesbiometrics.com&quot; target=&quot;_blank&quot;>Descarte Biometrics</a>  offers a product which detects and maps <strong>the shape of your ear shell</strong>, and uses it for authentication.</p>&amp;#10;&amp;#10;<table><tbody><tr><td>&amp;#10;<img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;>&amp;#10;</td><td><p>The company is pretty protective about their API, so it's hard to tell what exactly is needed to use this technology.</p><p></p>Probably, this has the same barriers as scanning an image:&amp;#10;<ul>&amp;#10;<li>you need to have access to your smartphone</li>&amp;#10;<li>an app must be installed</li></ul><p></p>&amp;#10;</td></tr></tbody></table>\"><p>We know that fingerprints do not tend to change. However, there are more parts of our body that are stable, like the shape of our ears. What if we could authenticate ourselves by <strong>holding a phone to our ear</strong>?</p>\n" +
                "<p><a href=\"http://www.descartesbiometrics.com\" target=\"_blank\">Descarte Biometrics</a>  offers a product which detects and maps <strong>the shape of your ear shell</strong>, and uses it for authentication.</p>\n" +
                "\n" +
                "<table><tbody><tr><td>\n" +
                "<img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\">\n" +
                "</td><td><p>The company is pretty protective about their API, so it's hard to tell what exactly is needed to use this technology.</p><p></p>Probably, this has the same barriers as scanning an image:\n" +
                "<ul>\n" +
                "<li>you need to have access to your smartphone</li>\n" +
                "<li>an app must be installed</li></ul><p></p>\n" +
                "</td></tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><div _ngcontent-khm-13=\"\" ng-reflect-inner-h-t-m-l=\"<img src=&quot;data/blogposts/alternative-ways-to-log-in/ear.jpg&quot; alt=&quot;Ear shape identitification&quot;>\"><img src=\"data/blogposts/alternative-ways-to-log-in/ear.jpg\" alt=\"Ear shape identitification\"></div>\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}--></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>Facial recognition</h3>\"><h3>Facial recognition</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>A very popular authentication mechanism in (sci-fi) movies, has already slipped into some home entertainment systems and smartphones: facial recognition!</p>&amp;#10;&amp;#10;This technology has grown over the years. Several services have already been made publicly available, for example <a href=&quot;https://www.microsoft.com/cognitive-services/en-us/face-api&quot; target=&quot;_blank&quot;>Microsoft cognitive services</a> and <a href=&quot;https://lambdal.com&quot; target=&quot;_blank&quot;>Lambdal</a>.<p></p>&amp;#10;&amp;#10;<p>How do you use such services? You upload 2 pictures to a web service, and you&amp;#8217;ll get back whether the same person is on both pictures. Pretty easy!</p>&amp;#10;&amp;#10;<table><tbody><tr><td>&amp;#10;<img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;>&amp;#10;</td><td><p>The biggest barrier is that you need <strong>a webcam</strong> and <strong>good light</strong> to log in. Many devices have web cams built in, but not all of them.</p>&amp;#10;&amp;#10;<p>It&amp;#8217;s not so hard to <strong>spoof</strong> this authentication system: finding a good <strong>social network profile picture</strong> is enough.</p>&amp;#10;</td></tr></tbody></table>\"><p>A very popular authentication mechanism in (sci-fi) movies, has already slipped into some home entertainment systems and smartphones: facial recognition!</p>\n" +
                "\n" +
                "This technology has grown over the years. Several services have already been made publicly available, for example <a href=\"https://www.microsoft.com/cognitive-services/en-us/face-api\" target=\"_blank\">Microsoft cognitive services</a> and <a href=\"https://lambdal.com\" target=\"_blank\">Lambdal</a>.<p></p>\n" +
                "\n" +
                "<p>How do you use such services? You upload 2 pictures to a web service, and you’ll get back whether the same person is on both pictures. Pretty easy!</p>\n" +
                "\n" +
                "<table><tbody><tr><td>\n" +
                "<img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\">\n" +
                "</td><td><p>The biggest barrier is that you need <strong>a webcam</strong> and <strong>good light</strong> to log in. Many devices have web cams built in, but not all of them.</p>\n" +
                "\n" +
                "<p>It’s not so hard to <strong>spoof</strong> this authentication system: finding a good <strong>social network profile picture</strong> is enough.</p>\n" +
                "</td></tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><video _ngcontent-khm-13=\"\" controls=\"\">\n" +
                "    <source _ngcontent-khm-13=\"\" ng-reflect-src=\"data/blogposts/alternative-ways-to-log-in/facialRecognition.mp4\" src=\"data/blogposts/alternative-ways-to-log-in/facialRecognition.mp4\">\n" +
                "</video></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h3>Fingerprint</h3>\"><h3>Fingerprint</h3></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<p>A common way to log in to your computer or smartphone is via your fingerprint. More and more APIs are becoming available for developers to use in their own apps.</p>&amp;#10;&amp;#10;<p>Sadly, there is <strong>no standardisation</strong> defined yet. That means that there is <strong>no API available that works with all fingerprint readers</strong>.</p> &amp;#10;<p>Still, if you&amp;#8217;re targeting iOS only, you can safely used <a href=&quot;https://developer.apple.com/library/content/samplecode/KeychainTouchID/Introduction/Intro.html&quot; target=&quot;_blank&quot;>Apple&amp;#8217;s Touch Id API</a>. For Androids version 6.0 and higher, Google has made <a href=&quot;https://developer.android.com/about/versions/marshmallow/android-6.0.html&quot; target=&quot;_blank&quot;>their own API</a> available.</p>&amp;#10;&amp;#10;<table><tbody><tr><td>&amp;#10;<img src=&quot;data/blogposts/alternative-ways-to-log-in/barrier.svg&quot; class=&quot;small&quot;>&amp;#10;</td><td>The barriers are still very steep:&amp;#10;<ul>&amp;#10;<li>the device has to have a fingerprint reader</li>&amp;#10;<li>there is no standardisation, leaving you up to lots of different implementation for every vendor</li></ul>&amp;#10;</td></tr></tbody></table>\"><p>A common way to log in to your computer or smartphone is via your fingerprint. More and more APIs are becoming available for developers to use in their own apps.</p>\n" +
                "\n" +
                "<p>Sadly, there is <strong>no standardisation</strong> defined yet. That means that there is <strong>no API available that works with all fingerprint readers</strong>.</p> \n" +
                "<p>Still, if you’re targeting iOS only, you can safely used <a href=\"https://developer.apple.com/library/content/samplecode/KeychainTouchID/Introduction/Intro.html\" target=\"_blank\">Apple’s Touch Id API</a>. For Androids version 6.0 and higher, Google has made <a href=\"https://developer.android.com/about/versions/marshmallow/android-6.0.html\" target=\"_blank\">their own API</a> available.</p>\n" +
                "\n" +
                "<table><tbody><tr><td>\n" +
                "<img src=\"data/blogposts/alternative-ways-to-log-in/barrier.svg\" class=\"small\">\n" +
                "</td><td>The barriers are still very steep:\n" +
                "<ul>\n" +
                "<li>the device has to have a fingerprint reader</li>\n" +
                "<li>there is no standardisation, leaving you up to lots of different implementation for every vendor</li></ul>\n" +
                "</td></tr></tbody></table></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"[object Object]\"\n" +
                "}--><div _ngcontent-khm-12=\"\" class=\"medium\">\n" +
                "            <portfolio-article-piece-medium _ngcontent-khm-12=\"\" _nghost-khm-13=\"\" ng-reflect-medium=\"[object Object]\"><!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><div _ngcontent-khm-13=\"\" ng-reflect-inner-h-t-m-l=\"<a title=&quot;By The Photographer (Own work) [CC BY-SA 3.0 (http://creativecommons.org/licenses/by-sa/3.0) or GFDL &amp;#10;(http://www.gnu.org/copyleft/fdl.html)], via Wikimedia Commons&quot; href=&quot;https://commons.wikimedia.org/wiki/File%3AFingerprint_picture.svg&quot;><img alt=&quot;Fingerprint picture&quot; src=&quot;https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Fingerprint_picture.svg/256px-Fingerprint_picture.svg.png&quot;></a>\"><a title=\"By The Photographer (Own work) [CC BY-SA 3.0 (http://creativecommons.org/licenses/by-sa/3.0) or GFDL \n" +
                "(http://www.gnu.org/copyleft/fdl.html)], via Wikimedia Commons\" href=\"https://commons.wikimedia.org/wiki/File%3AFingerprint_picture.svg\"><img alt=\"Fingerprint picture\" src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Fingerprint_picture.svg/256px-Fingerprint_picture.svg.png\"></a></div>\n" +
                "<!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}--></portfolio-article-piece-medium>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div><div _ngcontent-khm-10=\"\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": null\n" +
                "}-->\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-if\": \"true\"\n" +
                "}--><portfolio-article-piece-with-text-focus _ngcontent-khm-10=\"\" _nghost-khm-12=\"\" ng-reflect-data=\"[object Object]\"><div _ngcontent-khm-12=\"\" class=\"piece\">\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"text\" ng-reflect-inner-h-t-m-l=\"<h2>Conclusion</h2>&amp;#10;<p>The need for alternative authentication mechanisms is growing stronger.</p>&amp;#10;&amp;#10;<p>Still, authentication by &amp;#8220;what you have&amp;#8221; or &amp;#8220;what you are&amp;#8221; involves having tech, from a smartphone + internet connection to specialised hardware. This kind of authentication poses barriers which are maybe too high for your users.</p>&amp;#10;&amp;#10;<p>However, if you deal with highly valuable, personal information, it&amp;#8217;s a developer&amp;#8217;s duty to make sure this data is kept safe. Even if that means a more lengthy login mechanism.</p>&amp;#10;&amp;#10;<font size=&quot;2&quot;><i>Barrier icon made from <a href=&quot;http://www.onlinewebfonts.com/icon&quot;>Icon Fonts</a> is licensed by CC BY 3.0</i></font>\"><h2>Conclusion</h2>\n" +
                "<p>The need for alternative authentication mechanisms is growing stronger.</p>\n" +
                "\n" +
                "<p>Still, authentication by “what you have” or “what you are” involves having tech, from a smartphone + internet connection to specialised hardware. This kind of authentication poses barriers which are maybe too high for your users.</p>\n" +
                "\n" +
                "<p>However, if you deal with highly valuable, personal information, it’s a developer’s duty to make sure this data is kept safe. Even if that means a more lengthy login mechanism.</p>\n" +
                "\n" +
                "<font size=\"2\"><i>Barrier icon made from <a href=\"http://www.onlinewebfonts.com/icon\">Icon Fonts</a> is licensed by CC BY 3.0</i></font></div>\n" +
                "    <div _ngcontent-khm-12=\"\" class=\"media\">\n" +
                "        <!--template bindings={\n" +
                "  \"ng-reflect-ng-for-of\": \"\"\n" +
                "}-->\n" +
                "    </div>\n" +
                "</div></portfolio-article-piece-with-text-focus>\n" +
                "    </div>\n" +
                "    \n" +
                "</div></portfolio-article>",
            LocalDate.of(2017, 2, 18),
            Arrays.asList("web", "security", "programming"),
            null);
    }

    public static BlogPost completeAlternative() {
        return completeAlternative(LocalDate.of(2017, 11, 11));
    }

    public static BlogPost completeAlternative(LocalDate publishDate) {
        return new BlogPost("experiments-with-arquillian",
            "Experiments with Arquillian on Wildfly",
            "For my current project, the need for deep integration tests rises. To prepare myself, I've done some experiments.",
            "<img src=\"data/projects/colruyt/colruyt.png\" alt=\"\" />",
            null,
            publishDate,
            Arrays.asList("Arquillian", "Integration Tests", "programming"),
            "https://github.com/stainii/arquillian-wildfly-example/blob/master/README.md");
    }
}
