package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه 9 ساده — داستان‌های کلاسیک کوتاه
 * هر داستان: ۷ فصل × ۱۰ خط
 */
object Group9 {

    fun getAll(): List<StoryContent> = listOf(
        story46(), story47(), story48(), story49(), story50()
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۶: The Crow and the Pitcher
    // ═══════════════════════════════════════════════════════
    private fun story46() = StoryContent(
        storyId = "simple_46",
        chapters = listOf(
            StoryChapter(1, "A Thirsty Crow", "کلاغ تشنه", listOf(
                StoryParagraph("A crow was very thirsty.", "کلاغی خیلی تشنه بود."),
                StoryParagraph("He flew over the fields.", "او بر فراز مزارع پرواز کرد."),
                StoryParagraph("He looked for water.", "او دنبال آب گشت."),
                StoryParagraph("He saw a pitcher on the ground.", "او کوزه‌ای روی زمین دید."),
                StoryParagraph("He flew down to it.", "او به سمتش پرواز کرد."),
                StoryParagraph("There was a little water inside.", "کمی آب داخلش بود."),
                StoryParagraph("But his beak could not reach it.", "اما منقارش به آن نمی‌رسید."),
                StoryParagraph("He was very sad.", "او خیلی غمگین شد."),
                StoryParagraph("He thought for a while.", "او مدتی فکر کرد."),
                StoryParagraph("Then he had a clever idea.", "بعد فکر باهوشی به ذهنش رسید.")
            )),
            StoryChapter(2, "The Clever Idea", "فکر باهوشانه", listOf(
                StoryParagraph("He flew to a nearby stream.", "او به جوی آبی نزدیک پرواز کرد."),
                StoryParagraph("He picked up a small stone.", "او سنگ کوچکی برداشت."),
                StoryParagraph("He flew back to the pitcher.", "او به سمت کوزه برگشت."),
                StoryParagraph("He dropped the stone inside.", "سنگ را داخل انداخت."),
                StoryParagraph("The water level went up a little.", "سطح آب کمی بالا آمد."),
                StoryParagraph("He picked up another stone.", "سنگ دیگری برداشت."),
                StoryParagraph("He dropped it in too.", "آن را هم انداخت."),
                StoryParagraph("He did this many times.", "این کار را بارها انجام داد."),
                StoryParagraph("The water rose higher and higher.", "آب بالاتر و بالاتر آمد."),
                StoryParagraph("Finally, he could drink.", "بالاخره توانست بنوشد.")
            )),
            StoryChapter(3, "The Hard Work", "کار سخت", listOf(
                StoryParagraph("The crow worked for hours.", "کلاغ ساعت‌ها کار کرد."),
                StoryParagraph("His wings were tired.", "بال‌هایش خسته شدند."),
                StoryParagraph("But he did not give up.", "اما تسلیم نشد."),
                StoryParagraph("He carried hundreds of stones.", "او صدها سنگ حمل کرد."),
                StoryParagraph("Each stone brought water closer.", "هر سنگ آب را نزدیک‌تر می‌کرد."),
                StoryParagraph("He kept working patiently.", "او صبورانه به کار ادامه داد."),
                StoryParagraph("He knew he would succeed.", "می‌دانست موفق می‌شود."),
                StoryParagraph("He believed in himself.", "او به خودش ایمان داشت."),
                StoryParagraph("He never stopped trying.", "هرگز از تلاش دست نکشید."),
                StoryParagraph("And he finally reached the water.", "و بالاخره به آب رسید.")
            )),
            StoryChapter(4, "A Wise Lesson", "درسی حکیمانه", listOf(
                StoryParagraph("The crow drank the cool water.", "کلاغ آب خنک را نوشید."),
                StoryParagraph("He felt happy and strong.", "او احساس خوشحالی و قدرت کرد."),
                StoryParagraph("He flew away with joy.", "او با شادی پرواز کرد."),
                StoryParagraph("He learned a great lesson.", "او درس بزرگی یاد گرفت."),
                StoryParagraph("Small steps lead to big success.", "قدم‌های کوچک به موفقیت بزرگ می‌رسند."),
                StoryParagraph("Patience is always rewarded.", "صبر همیشه پاداش دارد."),
                StoryParagraph("Never give up on your goals.", "هرگز اهدافت را رها نکن."),
                StoryParagraph("Hard work always pays off.", "کار سخت همیشه نتیجه می‌دهد."),
                StoryParagraph("The crow told his friends.", "کلاغ به دوستانش گفت."),
                StoryParagraph("They learned from his story.", "آن‌ها از داستانش یاد گرفتند.")
            )),
            StoryChapter(5, "The Story Spreads", "داستان پخش می‌شود", listOf(
                StoryParagraph("The other birds heard the story.", "پرندگان دیگر داستان را شنیدند."),
                StoryParagraph("They were amazed by the crow.", "آن‌ها از کلاغ شگفت‌زده شدند."),
                StoryParagraph("They asked him to teach them.", "از او خواستند به آن‌ها یاد بدهد."),
                StoryParagraph("He taught them his trick.", "او ترفندش را به آن‌ها یاد داد."),
                StoryParagraph("Soon all birds used it.", "به‌زودی همه پرندگان از آن استفاده کردند."),
                StoryParagraph("They never went thirsty again.", "آن‌ها دیگر هرگز تشنه نماندند."),
                StoryParagraph("The crow became a hero.", "کلاغ قهرمان شد."),
                StoryParagraph("He was kind and generous.", "او مهربان و بخشنده بود."),
                StoryParagraph("He helped everyone.", "او به همه کمک می‌کرد."),
                StoryParagraph("He lived a happy life.", "او زندگی شادی داشت.")
            )),
            StoryChapter(6, "The Old Crow", "کلاغ پیر", listOf(
                StoryParagraph("Many years passed.", "سال‌های زیادی گذشت."),
                StoryParagraph("The crow became old and grey.", "کلاغ پیر و خاکستری شد."),
                StoryParagraph("He could not fly very far.", "نمی‌توانست خیلی دور پرواز کند."),
                StoryParagraph("But he was still clever.", "اما هنوز باهوش بود."),
                StoryParagraph("Young birds came to visit him.", "پرندگان جوان به دیدارش می‌آمدند."),
                StoryParagraph("They asked for his advice.", "آن‌ها از او مشورت می‌خواستند."),
                StoryParagraph("He told them the old story.", "او داستان قدیمی را برایشان می‌گفت."),
                StoryParagraph("The story of the pitcher.", "داستان آن کوزه."),
                StoryParagraph("The story of patience.", "داستان صبر."),
                StoryParagraph("The story of never giving up.", "داستان تسلیم نشدن.")
            )),
            StoryChapter(7, "The Final Lesson", "درس نهایی", listOf(
                StoryParagraph("One day, the old crow died.", "یک روز، کلاغ پیر مرد."),
                StoryParagraph("All the birds were very sad.", "همه پرندگان خیلی غمگین شدند."),
                StoryParagraph("They held a big funeral for him.", "آن‌ها برایش مراسم بزرگی گرفتند."),
                StoryParagraph("They remembered his wisdom.", "آن‌ها حکمتش را به یاد آوردند."),
                StoryParagraph("They remembered his kindness.", "مهربانی‌اش را به یاد آوردند."),
                StoryParagraph("They remembered his story.", "داستانش را به یاد آوردند."),
                StoryParagraph("And they told it to their children.", "و آن را برای فرزندانشان تعریف کردند."),
                StoryParagraph("The story was passed on forever.", "داستان برای همیشه منتقل شد."),
                StoryParagraph("The crow became a legend.", "کلاغ افسانه شد."),
                StoryParagraph("The legend of patience and wisdom.", "افسانه صبر و حکمت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۷: The Ant and the Grasshopper
    // ═══════════════════════════════════════════════════════
    private fun story47() = StoryContent(
        storyId = "simple_47",
        chapters = listOf(
            StoryChapter(1, "Summer Days", "روزهای تابستان", listOf(
                StoryParagraph("It was a hot summer day.", "یک روز گرم تابستان بود."),
                StoryParagraph("An ant was working hard.", "موریانه‌ای سخت کار می‌کرد."),
                StoryParagraph("He was collecting food.", "او در حال جمع‌آوری غذا بود."),
                StoryParagraph("He carried seeds to his home.", "او دانه‌ها را به خانه‌اش می‌برد."),
                StoryParagraph("He worked all day long.", "او تمام روز کار می‌کرد."),
                StoryParagraph("A grasshopper was nearby.", "ملخی نزدیک بود."),
                StoryParagraph("He was singing happily.", "او با خوشحالی آواز می‌خواند."),
                StoryParagraph("He was not working at all.", "او اصلاً کار نمی‌کرد."),
                StoryParagraph("He laughed at the ant.", "او به موریانه می‌خندید."),
                StoryParagraph("He said the ant was foolish.", "او گفت موریانه احمق است.")
            )),
            StoryChapter(2, "The Grasshopper's Song", "آواز ملخ", listOf(
                StoryParagraph("The grasshopper sang all summer.", "ملخ تمام تابستان آواز خواند."),
                StoryParagraph("He danced in the sunshine.", "او زیر آفتاب می‌رقصید."),
                StoryParagraph("He ate the fresh green leaves.", "او برگ‌های سبز تازه را می‌خورد."),
                StoryParagraph("He drank the morning dew.", "او شبنم صبح را می‌نوشید."),
                StoryParagraph("He did not think about winter.", "او به زمستان فکر نمی‌کرد."),
                StoryParagraph("He did not save any food.", "او هیچ غذایی ذخیره نکرد."),
                StoryParagraph("He just enjoyed the moment.", "او فقط از لحظه لذت می‌برد."),
                StoryParagraph("He laughed at the working ant.", "او به موریانه کارگر می‌خندید."),
                StoryParagraph("He said work was for fools.", "او می‌گفت کار برای احمق‌هاست."),
                StoryParagraph("He thought life was for fun.", "او فکر می‌کرد زندگی برای تفریح است.")
            )),
            StoryChapter(3, "Winter Comes", "زمستان می‌آید", listOf(
                StoryParagraph("Summer ended quickly.", "تابستان سریع تمام شد."),
                StoryParagraph("Autumn passed by.", "پاییز گذشت."),
                StoryParagraph("Winter arrived cold and harsh.", "زمستان سرد و سخت رسید."),
                StoryParagraph("The grasshopper had no food.", "ملخ هیچ غذایی نداشت."),
                StoryParagraph("He had no warm shelter.", "او هیچ سرپناه گرمی نداشت."),
                StoryParagraph("He was hungry and cold.", "او گرسنه و سرد بود."),
                StoryParagraph("He looked for food everywhere.", "او همه‌جا دنبال غذا گشت."),
                StoryParagraph("But he found nothing.", "اما چیزی پیدا نکرد."),
                StoryParagraph("The ground was covered with snow.", "زمین پوشیده از برف بود."),
                StoryParagraph("He began to cry.", "او شروع به گریه کرد.")
            )),
            StoryChapter(4, "The Grasshopper's Regret", "پشیمانی ملخ", listOf(
                StoryParagraph("The grasshopper felt very sorry.", "ملخ خیلی پشیمان شد."),
                StoryParagraph("He wished he had worked.", "او آرزو کرد که کار کرده بود."),
                StoryParagraph("He wished he had saved food.", "آرزو کرد غذا ذخیره کرده بود."),
                StoryParagraph("He remembered the ant.", "او موریانه را به یاد آورد."),
                StoryParagraph("He decided to ask for help.", "او تصمیم گرفت کمک بخواهد."),
                StoryParagraph("He went to the ant's home.", "او به خانه موریانه رفت."),
                StoryParagraph("He knocked on the door.", "او در زد."),
                StoryParagraph("The ant opened it.", "موریانه آن را باز کرد."),
                StoryParagraph("The grasshopper begged for food.", "ملخ برای غذا التماس کرد."),
                StoryParagraph("The ant felt sorry for him.", "موریانه به او ترحم کرد.")
            )),
            StoryChapter(5, "A Second Chance", "شانس دوباره", listOf(
                StoryParagraph("The ant gave him some food.", "موریانه کمی غذا به او داد."),
                StoryParagraph("He let him stay for the winter.", "او اجازه داد زمستان بماند."),
                StoryParagraph("The grasshopper was grateful.", "ملخ سپاسگزار شد."),
                StoryParagraph("He promised to work next summer.", "قول داد تابستان بعد کار کند."),
                StoryParagraph("The ant smiled and nodded.", "موریانه لبخند زد و سر تکان داد."),
                StoryParagraph("Winter passed slowly.", "زمستان آرام گذشت."),
                StoryParagraph("The grasshopper learned a lot.", "ملخ خیلی چیزها یاد گرفت."),
                StoryParagraph("He learned the value of work.", "ارزش کار را یاد گرفت."),
                StoryParagraph("He learned the value of planning.", "ارزش برنامه‌ریزی را یاد گرفت."),
                StoryParagraph("He learned the value of friendship.", "ارزش دوستی را یاد گرفت.")
            )),
            StoryChapter(6, "The Next Summer", "تابستان بعد", listOf(
                StoryParagraph("Summer came again.", "تابستان دوباره آمد."),
                StoryParagraph("The grasshopper worked hard.", "ملخ سخت کار کرد."),
                StoryParagraph("He collected food every day.", "هر روز غذا جمع می‌کرد."),
                StoryParagraph("He helped the ant too.", "او به موریانه هم کمک کرد."),
                StoryParagraph("They became best friends.", "آن‌ها بهترین دوست شدند."),
                StoryParagraph("They worked and sang together.", "با هم کار و آواز می‌خواندند."),
                StoryParagraph("They shared everything.", "همه چیز را تقسیم می‌کردند."),
                StoryParagraph("They were happy and safe.", "آن‌ها خوشحال و ایمن بودند."),
                StoryParagraph("The grasshopper never forgot.", "ملخ هرگز فراموش نکرد."),
                StoryParagraph("He never wasted another summer.", "او هرگز تابستان دیگری را هدر نداد.")
            )),
            StoryChapter(7, "The Lesson", "درس", listOf(
                StoryParagraph("This story teaches us something.", "این داستان چیزی به ما می‌آموزد."),
                StoryParagraph("We should always prepare.", "ما باید همیشه آماده باشیم."),
                StoryParagraph("We should not waste time.", "نباید وقت را هدر دهیم."),
                StoryParagraph("We should think about the future.", "باید به آینده فکر کنیم."),
                StoryParagraph("We should work and play.", "باید کار و بازی کنیم."),
                StoryParagraph("Balance is important in life.", "تعادل در زندگی مهم است."),
                StoryParagraph("Work hard, but also enjoy.", "سخت کار کن، اما لذت هم ببر."),
                StoryParagraph("Save for tomorrow, but live today.", "برای فردا ذخیره کن، اما امروز زندگی کن."),
                StoryParagraph("The ant and the grasshopper teach us.", "موریانه و ملخ به ما می‌آموزند."),
                StoryParagraph("Life is about balance.", "زندگی درباره تعادل است.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۸: The Lion and the Mouse
    // ═══════════════════════════════════════════════════════
    private fun story48() = StoryContent(
        storyId = "simple_48",
        chapters = listOf(
            StoryChapter(1, "The Sleeping Lion", "شیر خفته", listOf(
                StoryParagraph("A lion was sleeping in the forest.", "شیری در جنگل خواب بود."),
                StoryParagraph("He was the king of the jungle.", "او پادشاه جنگل بود."),
                StoryParagraph("He was big and strong.", "او بزرگ و قوی بود."),
                StoryParagraph("All animals feared him.", "همه حیوانات از او می‌ترسیدند."),
                StoryParagraph("A little mouse was playing nearby.", "موش کوچکی نزدیک بازی می‌کرد."),
                StoryParagraph("He ran across the lion's nose.", "او روی بینی شیر دوید."),
                StoryParagraph("The lion woke up suddenly.", "شیر ناگهان بیدار شد."),
                StoryParagraph("He caught the mouse in his paw.", "او موش را در پنجه‌اش گرفت."),
                StoryParagraph("The mouse was terrified.", "موش وحشت کرد."),
                StoryParagraph("He begged for his life.", "او برای زندگی‌اش التماس کرد.")
            )),
            StoryChapter(2, "The Mouse's Plea", "التماس موش", listOf(
                StoryParagraph("The mouse said, \"Please let me go.\"", "موش گفت: «لطفاً رهایم کن.»"),
                StoryParagraph("\"I will help you one day.\"", "«روزی به تو کمک خواهم کرد.»"),
                StoryParagraph("The lion laughed at him.", "شیر به او خندید."),
                StoryParagraph("\"You are too small to help me.\"", "«تو برای کمک به من خیلی کوچکی.»"),
                StoryParagraph("The mouse said, \"Please try me.\"", "موش گفت: «لطفاً امتحانم کن.»"),
                StoryParagraph("The lion felt kind that day.", "شیر آن روز مهربان بود."),
                StoryParagraph("He let the mouse go.", "او موش را رها کرد."),
                StoryParagraph("The mouse ran away quickly.", "موش سریع فرار کرد."),
                StoryParagraph("He promised to remember.", "او قول داد به یاد داشته باشد."),
                StoryParagraph("The lion forgot about him.", "شیر او را فراموش کرد.")
            )),
            StoryChapter(3, "The Hunter's Trap", "تله شکارچی", listOf(
                StoryParagraph("Days passed.", "روزها گذشت."),
                StoryParagraph("A hunter set a trap in the forest.", "شکارچی تله‌ای در جنگل گذاشت."),
                StoryParagraph("The lion walked into it.", "شیر به داخلش رفت."),
                StoryParagraph("A net fell over him.", "توری رویش افتاد."),
                StoryParagraph("He could not escape.", "او نمی‌توانست فرار کند."),
                StoryParagraph("He roared loudly for help.", "او بلند برای کمک نعره زد."),
                StoryParagraph("All the animals heard him.", "همه حیوانات صدایش را شنیدند."),
                StoryParagraph("But no one came to help.", "اما هیچ‌کس برای کمک نیامد."),
                StoryParagraph("They were all too afraid.", "همه خیلی ترسیده بودند."),
                StoryParagraph("The lion was trapped.", "شیر گرفتار شد.")
            )),
            StoryChapter(4, "The Little Mouse Helps", "موش کوچک کمک می‌کند", listOf(
                StoryParagraph("The little mouse heard the roar.", "موش کوچک نعره را شنید."),
                StoryParagraph("He ran to the lion.", "او به سمت شیر دوید."),
                StoryParagraph("He saw the net around him.", "توری دورش را دید."),
                StoryParagraph("He started to bite the ropes.", "او شروع کرد به جویدن طناب‌ها."),
                StoryParagraph("He chewed and chewed.", "او جوید و جوید."),
                StoryParagraph("His teeth were small but sharp.", "دندان‌هایش کوچک اما تیز بودند."),
                StoryParagraph("Slowly, the ropes broke.", "آرام‌آرام، طناب‌ها پاره شدند."),
                StoryParagraph("The lion was free.", "شیر آزاد شد."),
                StoryParagraph("He was amazed by the mouse.", "او از موش شگفت‌زده شد."),
                StoryParagraph("He thanked him with tears.", "او با اشک تشکر کرد.")
            )),
            StoryChapter(5, "The Lion's Gratitude", "قدردانی شیر", listOf(
                StoryParagraph("The lion said, \"You saved me.\"", "شیر گفت: «تو نجاتم دادی.»"),
                StoryParagraph("The mouse said, \"I told you I would.\"", "موش گفت: «گفتم که می‌کنم.»"),
                StoryParagraph("The lion learned a lesson.", "شیر درسی یاد گرفت."),
                StoryParagraph("Size is not everything.", "اندازه همه چیز نیست."),
                StoryParagraph("Small friends can be great friends.", "دوستان کوچک می‌توانند دوستان بزرگی باشند."),
                StoryParagraph("Kindness is always rewarded.", "مهربانی همیشه پاداش دارد."),
                StoryParagraph("He never laughed at small animals.", "او هرگز به حیوانات کوچک نخندید."),
                StoryParagraph("He became friends with the mouse.", "او با موش دوست شد."),
                StoryParagraph("They stayed together always.", "آن‌ها همیشه با هم ماندند."),
                StoryParagraph("They helped each other forever.", "آن‌ها برای همیشه به هم کمک کردند.")
            )),
            StoryChapter(6, "A New Friendship", "دوستی جدید", listOf(
                StoryParagraph("The lion and the mouse became friends.", "شیر و موش دوست شدند."),
                StoryParagraph("They ate together every day.", "هر روز با هم غذا می‌خوردند."),
                StoryParagraph("They played together every evening.", "هر عصر با هم بازی می‌کردند."),
                StoryParagraph("The other animals were surprised.", "حیوانات دیگر تعجب کردند."),
                StoryParagraph("They learned from this friendship.", "آن‌ها از این دوستی یاد گرفتند."),
                StoryParagraph("They stopped judging by size.", "آن‌ها دست از قضاوت بر اساس اندازه برداشتند."),
                StoryParagraph("They became kinder to each other.", "آن‌ها با هم مهربان‌تر شدند."),
                StoryParagraph("The forest became a happy place.", "جنگل جای شادی شد."),
                StoryParagraph("Everyone helped everyone.", "همه به همه کمک می‌کردند."),
                StoryParagraph("And they all lived in peace.", "و همه در صلح زندگی کردند.")
            )),
            StoryChapter(7, "The Moral", "درس اخلاقی", listOf(
                StoryParagraph("This story has a moral.", "این داستان درس اخلاقی دارد."),
                StoryParagraph("No one is too small to help.", "هیچ‌کس برای کمک خیلی کوچک نیست."),
                StoryParagraph("No one is too big to need help.", "هیچ‌کس برای نیاز به کمک خیلی بزرگ نیست."),
                StoryParagraph("Kindness always comes back.", "مهربانی همیشه برمی‌گردد."),
                StoryParagraph("Friendship knows no size.", "دوستی اندازه نمی‌شناسد."),
                StoryParagraph("We should help each other.", "باید به هم کمک کنیم."),
                StoryParagraph("We should respect everyone.", "باید به همه احترام بگذاریم."),
                StoryParagraph("The lion and the mouse show us.", "شیر و موش به ما نشان می‌دهند."),
                StoryParagraph("Great things come in small packages.", "چیزهای بزرگ در بسته‌های کوچک می‌آیند."),
                StoryParagraph("And that is the end.", "و این پایان است.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۹: The Fox and the Grapes
    // ═══════════════════════════════════════════════════════
    private fun story49() = StoryContent(
        storyId = "simple_49",
        chapters = listOf(
            StoryChapter(1, "The Hungry Fox", "روباه گرسنه", listOf(
                StoryParagraph("A fox was very hungry.", "روباهی خیلی گرسنه بود."),
                StoryParagraph("He walked through the forest.", "او در جنگل قدم می‌زد."),
                StoryParagraph("He looked for food everywhere.", "او همه‌جا دنبال غذا گشت."),
                StoryParagraph("He saw a vineyard.", "او تاکستانی دید."),
                StoryParagraph("There were grapes on the vine.", "انگورهایی روی تاک بودند."),
                StoryParagraph("They looked juicy and sweet.", "آن‌ها آبدار و شیرین به نظر می‌رسیدند."),
                StoryParagraph("The fox's mouth watered.", "دهان روباه آب افتاد."),
                StoryParagraph("He wanted to eat them.", "او می‌خواست آن‌ها را بخورد."),
                StoryParagraph("He walked to the vine.", "او به سمت تاک رفت."),
                StoryParagraph("He tried to reach them.", "او تلاش کرد به آن‌ها برسد.")
            )),
            StoryChapter(2, "The Jumping Fox", "روباه جهنده", listOf(
                StoryParagraph("The grapes were very high.", "انگورها خیلی بالا بودند."),
                StoryParagraph("The fox jumped to reach them.", "روباه برای رسیدن به آن‌ها پرید."),
                StoryParagraph("He missed them by a little.", "کمی از آن‌ها خطا کرد."),
                StoryParagraph("He tried again and again.", "او دوباره و دوباره تلاش کرد."),
                StoryParagraph("He jumped higher each time.", "هر بار بالاتر می‌پرید."),
                StoryParagraph("But he could not reach them.", "اما نمی‌توانست به آن‌ها برسد."),
                StoryParagraph("His legs were getting tired.", "پاهایش خسته می‌شدند."),
                StoryParagraph("He was breathing hard.", "او سخت نفس می‌کشید."),
                StoryParagraph("But he did not give up.", "اما تسلیم نشد."),
                StoryParagraph("He kept trying for hours.", "او ساعت‌ها به تلاش ادامه داد.")
            )),
            StoryChapter(3, "The Final Attempt", "تلاش نهایی", listOf(
                StoryParagraph("Finally, the fox stopped.", "بالاخره، روباه ایستاد."),
                StoryParagraph("He was exhausted and sad.", "او خسته و غمگین بود."),
                StoryParagraph("He looked up at the grapes.", "او به انگورها نگاه کرد."),
                StoryParagraph("They seemed to mock him.", "آن‌ها به نظر می‌رسید مسخره‌اش می‌کنند."),
                StoryParagraph("He tried one last time.", "او یک بار آخر تلاش کرد."),
                StoryParagraph("He jumped with all his strength.", "با تمام قدرتش پرید."),
                StoryParagraph("But he still missed them.", "اما همچنان خطا کرد."),
                StoryParagraph("He fell to the ground.", "او روی زمین افتاد."),
                StoryParagraph("He was too tired to try again.", "او برای تلاش دوباره خیلی خسته بود."),
                StoryParagraph("He sat there breathing hard.", "او همان‌جا نشست و سخت نفس کشید.")
            )),
            StoryChapter(4, "The Sour Grapes", "انگورهای ترش", listOf(
                StoryParagraph("The fox turned away.", "روباه روی برگرداند."),
                StoryParagraph("He walked away from the vine.", "او از تاک دور شد."),
                StoryParagraph("He said, \"Those grapes are sour.\"", "او گفت: «آن انگورها ترشند.»"),
                StoryParagraph("\"They are not worth eating.\"", "«ارزش خوردن ندارند.»"),
                StoryParagraph("\"I did not want them anyway.\"", "«به هر حال نمی‌خواستمشان.»"),
                StoryParagraph("But deep inside, he knew the truth.", "اما در اعماق وجودش، حقیقت را می‌دانست."),
                StoryParagraph("The grapes were sweet and juicy.", "انگورها شیرین و آبدار بودند."),
                StoryParagraph("He was just angry he could not reach them.", "او فقط عصبانی بود که نمی‌توانست به آن‌ها برسد."),
                StoryParagraph("He was lying to himself.", "او به خودش دروغ می‌گفت."),
                StoryParagraph("That made him feel better.", "این او را بهتر می‌کرد.")
            )),
            StoryChapter(5, "The Wise Owl", "جغد دانا", listOf(
                StoryParagraph("A wise owl was watching.", "جغد دانایی تماشا می‌کرد."),
                StoryParagraph("He flew down to the fox.", "او به سمت روباه پرواز کرد."),
                StoryParagraph("He said, \"Do not lie to yourself.\"", "او گفت: «به خودت دروغ نگو.»"),
                StoryParagraph("\"The grapes are not sour.\"", "«انگورها ترش نیستند.»"),
                StoryParagraph("\"You just could not reach them.\"", "«تو فقط نتوانستی به آن‌ها برسی.»"),
                StoryParagraph("\"It is okay to fail.\"", "«شکست خوردن اشکالی ندارد.»"),
                StoryParagraph("\"But do not pretend you did not want them.\"", "«اما تظاهر نکن که نمی‌خواستی‌شان.»"),
                StoryParagraph("The fox felt ashamed.", "روباه شرمنده شد."),
                StoryParagraph("He knew the owl was right.", "او می‌دانست جغد درست می‌گوید."),
                StoryParagraph("He thanked the owl for his honesty.", "او از جغد برای صداقتش تشکر کرد.")
            )),
            StoryChapter(6, "The New Plan", "نقشه جدید", listOf(
                StoryParagraph("The fox made a new plan.", "روباه نقشه جدیدی کشید."),
                StoryParagraph("He would come back with a ladder.", "او با نردبانی برمی‌گشت."),
                StoryParagraph("Or he would find a taller friend.", "یا دوست بلندقدتری پیدا می‌کرد."),
                StoryParagraph("He would find a way to get the grapes.", "راهی برای رسیدن به انگورها پیدا می‌کرد."),
                StoryParagraph("He would not give up.", "تسلیم نمی‌شد."),
                StoryParagraph("He would try a different way.", "او راه دیگری را امتحان می‌کرد."),
                StoryParagraph("He would learn from his mistakes.", "از اشتباهاتش یاد می‌گرفت."),
                StoryParagraph("He would succeed next time.", "دفعه بعد موفق می‌شد."),
                StoryParagraph("The owl smiled and said, \"Good luck.\"", "جغد لبخند زد و گفت: «موفق باشی.»"),
                StoryParagraph("The fox walked away with hope.", "روباه با امید دور شد.")
            )),
            StoryChapter(7, "The Moral", "درس اخلاقی", listOf(
                StoryParagraph("This story has a moral.", "این داستان درس اخلاقی دارد."),
                StoryParagraph("Do not lie to yourself.", "به خودت دروغ نگو."),
                StoryParagraph("If you fail, admit it.", "اگر شکست خوردی، اعتراف کن."),
                StoryParagraph("Do not pretend you did not want something.", "تظاهر نکن چیزی را نمی‌خواستی."),
                StoryParagraph("Learn from your failures.", "از شکست‌هایت یاد بگیر."),
                StoryParagraph("Try a different way next time.", "دفعه بعد راه دیگری را امتحان کن."),
                StoryParagraph("The fox learned this lesson.", "روباه این درس را یاد گرفت."),
                StoryParagraph("The owl taught him well.", "جغد خوب به او آموخت."),
                StoryParagraph("And they became friends.", "و آن‌ها دوست شدند."),
                StoryParagraph("The end of the fox and the grapes.", "پایان روباه و انگور.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۰: The Honest Woodcutter
    // ═══════════════════════════════════════════════════════
    private fun story50() = StoryContent(
        storyId = "simple_50",
        chapters = listOf(
            StoryChapter(1, "The Woodcutter", "چوب‌بر", listOf(
                StoryParagraph("There was a poor woodcutter.", "چوب‌بر فقیری بود."),
                StoryParagraph("He lived near a river.", "او نزدیک رودخانه‌ای زندگی می‌کرد."),
                StoryParagraph("He cut wood every day.", "او هر روز چوب می‌برید."),
                StoryParagraph("He sold the wood in the market.", "او چوب را در بازار می‌فروخت."),
                StoryParagraph("He was poor but honest.", "او فقیر اما صادق بود."),
                StoryParagraph("He never told lies.", "او هرگز دروغ نمی‌گفت."),
                StoryParagraph("He never stole anything.", "او هرگز چیزی نمی‌دزدید."),
                StoryParagraph("He worked hard every day.", "او هر روز سخت کار می‌کرد."),
                StoryParagraph("He had one old axe.", "او یک تبر کهنه داشت."),
                StoryParagraph("It was his only tool.", "این تنها ابزارش بود.")
            )),
            StoryChapter(2, "The Axe Falls", "تبر می‌افتد", listOf(
                StoryParagraph("One day, he went to the river.", "یک روز، او به رودخانه رفت."),
                StoryParagraph("He was cutting a tree.", "او درختی را می‌برید."),
                StoryParagraph("His axe slipped from his hand.", "تبرش از دستش لیز خورد."),
                StoryParagraph("It fell into the water.", "به داخل آب افتاد."),
                StoryParagraph("The river was deep.", "رودخانه عمیق بود."),
                StoryParagraph("He could not reach it.", "او نمی‌توانست به آن برسد."),
                StoryParagraph("He sat on the bank and cried.", "او کنار ساحل نشست و گریه کرد."),
                StoryParagraph("He had no money for a new axe.", "پولی برای تبر جدید نداشت."),
                StoryParagraph("He did not know what to do.", "نمی‌دانست چه کار کند."),
                StoryParagraph("He was very sad.", "او خیلی غمگین بود.")
            )),
            StoryChapter(3, "The River God", "خدای رودخانه", listOf(
                StoryParagraph("Suddenly, a man appeared.", "ناگهان، مردی ظاهر شد."),
                StoryParagraph("He came out of the river.", "او از رودخانه بیرون آمد."),
                StoryParagraph("He was the god of the river.", "او خدای رودخانه بود."),
                StoryParagraph("He asked, \"What is wrong?\"", "او پرسید: «مشکل چیست؟»"),
                StoryParagraph("The woodcutter told his story.", "چوب‌بر داستانش را گفت."),
                StoryParagraph("The god felt sorry for him.", "خدا به او ترحم کرد."),
                StoryParagraph("He went into the water.", "او به داخل آب رفت."),
                StoryParagraph("He brought out a golden axe.", "او تبری طلایی بیرون آورد."),
                StoryParagraph("He asked, \"Is this your axe?\"", "او پرسید: «این تبر توست؟»"),
                StoryParagraph("The woodcutter said, \"No.\"", "چوب‌بر گفت: «نه.»")
            )),
            StoryChapter(4, "The Silver Axe", "تبر نقره‌ای", listOf(
                StoryParagraph("The god went back into the water.", "خدا دوباره به آب رفت."),
                StoryParagraph("He brought out a silver axe.", "او تبری نقره‌ای بیرون آورد."),
                StoryParagraph("He asked, \"Is this your axe?\"", "او پرسید: «این تبر توست؟»"),
                StoryParagraph("The woodcutter said, \"No.\"", "چوب‌بر گفت: «نه.»"),
                StoryParagraph("The god was surprised.", "خدا شگفت‌زده شد."),
                StoryParagraph("He went back one more time.", "او یک بار دیگر به آب رفت."),
                StoryParagraph("He brought out the old iron axe.", "او تبر کهنه آهنی را بیرون آورد."),
                StoryParagraph("He asked, \"Is this your axe?\"", "او پرسید: «این تبر توست؟»"),
                StoryParagraph("The woodcutter said, \"Yes!\"", "چوب‌بر گفت: «بله!»"),
                StoryParagraph("He was very happy.", "او خیلی خوشحال شد.")
            )),
            StoryChapter(5, "The Reward", "پاداش", listOf(
                StoryParagraph("The god was pleased with him.", "خدا از او راضی شد."),
                StoryParagraph("He said, \"You are honest.\"", "او گفت: «تو صادق هستی.»"),
                StoryParagraph("\"You did not lie to get more.\"", "«دروغ نگفتی تا بیشتر بگیری.»"),
                StoryParagraph("\"I will give you all three axes.\"", "«هر سه تبر را به تو می‌دهم.»"),
                StoryParagraph("The woodcutter was amazed.", "چوب‌بر شگفت‌زده شد."),
                StoryParagraph("He thanked the god.", "او از خدا تشکر کرد."),
                StoryParagraph("He took the axes home.", "تبر‌ها را به خانه برد."),
                StoryParagraph("He sold the silver and gold.", "نقره و طلا را فروخت."),
                StoryParagraph("He became rich.", "او ثروتمند شد."),
                StoryParagraph("But he stayed honest.", "اما صادق ماند.")
            )),
            StoryChapter(6, "The Greedy Friend", "دوست حریص", listOf(
                StoryParagraph("A friend heard the story.", "دوستی داستان را شنید."),
                StoryParagraph("He was greedy and jealous.", "او حریص و حسود بود."),
                StoryParagraph("He went to the river.", "او به رودخانه رفت."),
                StoryParagraph("He dropped his axe in.", "او تبرش را داخل انداخت."),
                StoryParagraph("He cried loudly.", "او بلند گریه کرد."),
                StoryParagraph("The river god appeared.", "خدای رودخانه ظاهر شد."),
                StoryParagraph("He brought out a golden axe.", "او تبر طلایی بیرون آورد."),
                StoryParagraph("The man shouted, \"That's mine!\"", "مرد فریاد زد: «آن مال من است!»"),
                StoryParagraph("The god was angry.", "خدا عصبانی شد."),
                StoryParagraph("He disappeared with all the axes.", "او با همه تبر‌ها ناپدید شد.")
            )),
            StoryChapter(7, "The Moral", "درس اخلاقی", listOf(
                StoryParagraph("This story has a moral.", "این داستان درس اخلاقی دارد."),
                StoryParagraph("Honesty is always rewarded.", "صداقت همیشه پاداش دارد."),
                StoryParagraph("Greed leads to loss.", "حرص به باخت می‌رسد."),
                StoryParagraph("Be happy with what you have.", "به آنچه داری راضی باش."),
                StoryParagraph("Do not lie for money.", "برای پول دروغ نگو."),
                StoryParagraph("Truth is always the best path.", "حقیقت همیشه بهترین راه است."),
                StoryParagraph("The honest woodcutter teaches us.", "چوب‌بر صادق به ما می‌آموزد."),
                StoryParagraph("The greedy friend teaches us too.", "دوست حریص هم به ما می‌آموزد."),
                StoryParagraph("Choose honesty over wealth.", "صداقت را بر ثروت انتخاب کن."),
                StoryParagraph("And you will be happy.", "و خوشحال خواهی بود.")
            ))
        )
    )
}